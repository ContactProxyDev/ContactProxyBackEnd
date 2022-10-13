package ru.nsu.contactproxy.backend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringDocConfiguration {

    @Bean
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("ContactProxyAPI")
                                .description("API for backend part of ContactProxy")
                                .version("0.5")
                )
        ;
    }
}