package com.emsi.pfaProject.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth,DataSource dataSource) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select username as principal, password as credentials, true from utilisateur where username = ?")
                .authoritiesByUsernameQuery("select utilisateur_username as principal,roles_role as role from utilisateur_roles where utilisateur_username = ?")
                .rolePrefix("ROLE_");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.
                csrf().
                disable().
                authorizeRequests().
                anyRequest().
                authenticated().and().formLogin();
    }
}
