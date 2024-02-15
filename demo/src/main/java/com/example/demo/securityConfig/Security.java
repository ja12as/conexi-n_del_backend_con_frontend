
package com.example.demo.securityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/**").permitAll() // Permitir acceso público a ciertas rutas
            .anyRequest().authenticated() // Requiere autenticación para cualquier otra ruta
            .and()
            .formLogin(); // Habilitar formulario de inicio de sesión por defecto
    }
    
}