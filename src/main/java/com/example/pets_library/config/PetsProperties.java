package com.example.pets_library.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("idioma.mensaje")
public class PetsProperties {
	private String lenguaje = "Castellano";

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
}
