package com.apirests2.backends2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("http://localhost:5173")//Escribir la url del proyecto front a conectar
        .allowedMethods("*")//PODEMOS ESPECIFICAR LOS METODOS A PERMITIR DESDE EL FRONT,GET,POST,ETC
        .allowCredentials(true);
}
}

