package ru.nsu.contactproxy.backend;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.nsu.contactproxy.backend",
        "ru.nsu.contactproxy.backend.util", "ru.nsu.contactproxy.backend.configuration"})
public class ContactProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContactProxyApplication.class, args);
    }

    @Bean
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}