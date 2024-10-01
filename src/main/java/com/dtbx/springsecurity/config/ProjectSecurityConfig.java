package com.dtbx.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                    .requestMatchers("/myAccount", "/myCards", "/myLoans", "/myProfile").authenticated()
                    .requestMatchers("/notices", "/contact", "/error").permitAll())
                .formLogin(flc -> flc.disable())
                .httpBasic(withDefaults());
        return http.build();
    }
}
