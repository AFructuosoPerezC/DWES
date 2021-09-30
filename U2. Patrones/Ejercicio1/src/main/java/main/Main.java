package main;

import partes.Casa;
import partes.Pared;
import partes.Tejado;

public class Main {

	public static void main() {
		Casa miCasa = new Casa(
				432,
				new Tejado(),
				new Pared(2),
				new Pared(7),
				new Pared(1),
				new Pared(4)
			);
		
		System.out.println("Casa #1 terminada");
		
		Casa miCasa2 = new Casa(
				722,
				new Tejado(),
				new Pared(3),
				new Pared(6),
				new Pared(2),
				new Pared(3)
			);
		
		System.out.println("Casa #2 terminada");
	}	
}
