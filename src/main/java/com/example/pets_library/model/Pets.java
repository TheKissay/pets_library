package com.example.pets_library.model;

public class Pets {
	
	private String lenguaje;

	public Pets(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
	public String mensajeLenguaje() {
		String mensaje = "";
		
		switch (lenguaje) {
		case "Castellano":
			mensaje = "Bienvenido";
			break;
		case "Ingles":
			mensaje = "Welcome";
			break;
		case "Italiano":
			mensaje = "Bienvenute";
			break;
		default:
			mensaje = "Bienvenido";
			break;
		}
		
		return mensaje;
	}

}
