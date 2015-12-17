package org.levelup.labradoodle.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 * Class  {@Link org.levelup.labradoodle.config}
 *
 * @author Alexandr Barkovskiy.
 * @version 1.0
 * @since 09.12.15
 */
@Configuration
@EnableWebMvcSecurity
@ComponentScan
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    AuthenticationProvider authenticationProvider;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/get/**")
                .antMatchers("/img/**")
                .antMatchers("/fonts/**")
                .antMatchers("/basket/**")
                .antMatchers("/css/**")
                .antMatchers("/js/**") ;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/cabinet").hasRole("USER")
                .anyRequest().authenticated()
                .and()
            .formLogin().loginPage("/login").permitAll().and()
            .logout().logoutUrl("/logout").logoutSuccessUrl("/test");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider);

    }
}
