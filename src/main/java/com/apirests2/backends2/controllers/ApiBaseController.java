package com.apirests2.backends2.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@ControllerAdvice
@OpenAPIDefinition(
  info = @Info(
    title = "Mi API",
    version = "1.0.0",
    description = "Descripción de mi API"
  ),
  tags = {
    @Tag(name = "Controlador base", description = "Controlador base para todos los endpoints")
  }

)
public class ApiBaseController {

}
