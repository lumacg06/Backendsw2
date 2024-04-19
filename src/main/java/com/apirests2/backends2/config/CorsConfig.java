package com.apirests2.backends2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc

public class CorsConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*")
        .allowedOrigins("*")//Escribir la url del from a conectar
        .allowedMethods("*")//Podemos especificar los metodos a permitir desde el front, GET, POST, ECT.
        .allowCredentials(true);
    }


}
