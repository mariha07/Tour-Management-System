package com.example.TourManagementSystem.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security{

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("Mariha")
                .password("123")
                .roles("USER")
                .build();

        UserDetails staff = User.withDefaultPasswordEncoder()
                .username("staff")
                .password("password2")
                .roles("STAFF")
                .build();

        return new InMemoryUserDetailsManager(user,staff);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/**", "/swagger-ui/**", "/v3/api-docs/**").permitAll()
                        .requestMatchers("/user/**","/staff/**","tourPackage/**").hasAnyRole("STAFF")
                        .requestMatchers("/user/**","/tourPackage/**").hasRole("USER")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}