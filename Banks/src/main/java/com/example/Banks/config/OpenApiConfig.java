package com.example.Banks.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "banks",
                description = "Banks", version = "1.0.0",
                contact = @Contact(
                        name = "Kalikin",
                        email = "Kalikin@mail.ru"
                )
        )
)

public class OpenApiConfig {

}