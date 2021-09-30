package factory;

import forms.Circulo;
import forms.Cuadrado;
import forms.Figura;
import forms.Rectangulo;
import forms.Triangulo;

public class FactoryFigura {
	public static Figura getFigura(String color, String form) {
		switch (form)
		{
			case "triangulo":
				return new Triangulo(color);
			case "circulo":
				return new Circulo(color);
			case "Rectangulo":
				return new Rectangulo(color);
			case "cuadrado":
				return new Cuadrado(color);
			default:
				return null;
		}
	}
}