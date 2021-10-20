package com.example.pets_library.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.pets_library.model.Pets;

@Configuration
@ConditionalOnClass(Pets.class)
@EnableConfigurationProperties(PetsProperties.class)
public class PetsAutoconfigured {

	
	private final PetsProperties properties;

	public PetsAutoconfigured(PetsProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Pets pet() {
		return new Pets(properties.getLenguaje());
	}
	
	
	
}
