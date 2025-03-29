package com.gozarte.gozarte.config;

import java.beans.BeanProperty;
import java.beans.JavaBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

@Bean
public OpenAPI customOpenAPI() {
return   new   OpenAPI ()

.info(new Info()
.title("API de la Academia Gozarte")
.version("1.0")
.description("Documentación de la API para la plataforma de matrícula de la academia Gozarte.")
);

}


}