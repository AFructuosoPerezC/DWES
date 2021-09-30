package people;

public class Presidente {
	private static Presidente pres = null;
	
	private static String nombre;
	private static String apellidos;
	//Por simplificación del ejercicio, he usado un String para el año
	private static String eleccion;
	
	private static Presidente new_pres(String n, String a, String e) {
		pres.setNombre(n);
		pres.setApellidos(a);
		pres.setEleccion(e);
		
		return pres;
	}
	
	public Presidente(String nom, String ape, String ele) {
		super();
		
		if (pres == null)
		{
			pres = new_pres(nom, ape, ele);
		}
		else
		{
			System.out.println("Ya existe un Presidente.");
		}
	}
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Presidente.nombre = nombre;
	}
	
	public static String getApellidos() {
		return apellidos;
	}
	public static void setApellidos(String apellidos) {
		Presidente.apellidos = apellidos;
	}

	public static String getEleccion() {
		return eleccion;
	}
	public static void setEleccion(String string) {
		Presidente.eleccion = string;
	}
}