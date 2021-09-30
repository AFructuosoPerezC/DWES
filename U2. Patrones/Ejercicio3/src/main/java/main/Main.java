package main;

import people.Presidente;

public class Main {
	public void main() {
		Presidente p = new Presidente("Juan", "Cuesta", "1997");
		
		System.out.println(
				"Nombre: " + p.getNombre()
				+ "\nApellidos: " + p.getApellidos()
				+ "\nAño eleccion: " + p.getEleccion());
		
		// Intentamos crear una nueva instancia
		// que debería mostrar un mensaje indicando que ya existe una previa 
		Presidente pr = new Presidente("Andres", "Guerra", "1999");
		
		// Debe mostrar los mismos datos de la instancia anterior
		System.out.println(
				"Nombre: " + pr.getNombre()
				+ "\nApellidos: " + pr.getApellidos()
				+ "\nAño eleccion: " + pr.getEleccion());
	}
}