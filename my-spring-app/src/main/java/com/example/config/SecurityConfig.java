package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF for stateless APIs
            .authorizeRequests() // Using chain style
                .antMatchers("/login", "/public/**").permitAll() // Public endpoints
                .antMatchers("/participantes/**", "/consumo-alimentar/**").authenticated() // Secure endpoints
            .and()
            .httpBasic(); // Use basic authentication
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
