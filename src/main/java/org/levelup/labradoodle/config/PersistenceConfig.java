package org.levelup.labradoodle.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.util.Properties;

import static org.hibernate.cfg.Environment.*;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
public class PersistenceConfig implements TransactionManagementConfigurer {
    private String dialect = "org.hibernate.dialect.PostgreSQLDialect";
    private String hbm2ddlAuto = "create";
    private String packageToScan = "org.levelup.lbradoodle";

    /**
     * Configure {@link LocalContainerEntityManagerFactoryBean} instance with sent data from {@link DataSource}
     *
     * @return configured {@link LocalContainerEntityManagerFactoryBean} instance
     */
    @Bean
    @Autowired
    @DependsOn("dataSource")
    public LocalContainerEntityManagerFactoryBean configureEntityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setPackagesToScan(packageToScan);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties jpaProperties = new Properties();
        jpaProperties.put(DIALECT, dialect);
        jpaProperties.put(HBM2DDL_AUTO, hbm2ddlAuto);
        jpaProperties.put(SHOW_SQL, true);
        entityManagerFactoryBean.setJpaProperties(jpaProperties);
        return entityManagerFactoryBean;
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new JpaTransactionManager();
    }


    @Bean
    public DataSource dataSource() {
        DataSource dataSource = null;
        JndiTemplate jndi = new JndiTemplate();
        try {
            dataSource = (DataSource) jndi.lookup("java:comp/env/jdbc/db");
        } catch (NamingException e) {
            System.out.println(e);
//            logger.error("NamingException for java:comp/env/jdbc/yourname", e);
        }
        return dataSource;
    }
}

