package com.dipesh.jwt.jwtauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails userOne = User.builder().username("Dipesh").password(customPasswordEncode().encode("dipesh")).roles("ADMIN").build();
        UserDetails userTwo = User.builder().username("Alex").password(customPasswordEncode().encode("alex")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(userOne,userTwo);
    }

    @Bean
    public PasswordEncoder customPasswordEncode()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
