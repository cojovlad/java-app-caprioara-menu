package com.caprioara_menu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorize -> authorize
                        .anyRequest().permitAll() // Allow all requests without authentication
                )
                .csrf(csrf -> csrf.disable()) // Disable CSRF for non-state-changing requests
                .formLogin(form -> form
                        .loginPage("/custom-login") // Redirect to a custom login page
                        .permitAll() // Allow access to the login page for everyone
                        .successForwardUrl("/") // Redirect to the home page after successful login
                        .failureUrl("/custom-login?error=true") // Redirect on login failure
                        .usernameParameter("username") // Customize username parameter
                        .passwordParameter("password") // Customize password parameter
                )
                .logout(logout -> logout
                        .logoutUrl("/logout") // Customize logout URL
                        .logoutSuccessUrl("/") // Redirect after logout
                );

        return http.build();
    }
}
