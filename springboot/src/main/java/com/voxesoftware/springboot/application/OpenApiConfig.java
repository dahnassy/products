package com.voxesoftware.springboot.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration

public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI()
				.info(new Info()
				.title("API Products")
				.description("Essa API è muito doida")
				.contact(new Contact().name("Nathanal de Souza Leite").email("nathanaelsouzaleite@gmail.com")
						).version("1.0"));
				
	}
}
