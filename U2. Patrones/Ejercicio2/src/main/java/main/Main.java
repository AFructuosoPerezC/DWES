package main;

import factory.FactoryFigura;
import forms.Figura;

public class Main {
	public static void main(){
		Figura tri = FactoryFigura.getFigura("azul", "triangulo");
		Figura rec = FactoryFigura.getFigura("verde", "rectangulo");
		Figura cir = FactoryFigura.getFigura("amarillo", "cirulo");
		Figura cua = FactoryFigura.getFigura("rojo", "cuadrado");
		
		tri.dibujarFigura();
		rec.dibujarFigura();
		cir.dibujarFigura();
		cua.dibujarFigura();
		
		System.out.println("Figuras terminadas");
	}
}
