package org.levelup.labradoodle.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Class {@link ApplicationConfig} contain common configuration for application
 *
 * @author Oleg Kalinichenko
 * @version 1.0
 * @since 21.07.2015
 */
@Configuration
@EnableScheduling
public class ApplicationConfig {
    private static final Integer TASKS_POOL_SIZE = 10;

    @Value("${LD_PORT:8080}")
    private int port;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(destroyMethod = "shutdown")
    public ScheduledExecutorService taskExecutor() {
        return Executors.newScheduledThreadPool(TASKS_POOL_SIZE);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory servletContainer =
                new JettyEmbeddedServletContainerFactory("/*", port);
        return servletContainer;
    }
}
