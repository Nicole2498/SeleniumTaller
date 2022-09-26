package package1;

public class Perro extends Animal {
	
	public String nombre;
	private int edad;
	public String raza;
	
	public void hablar() {
		System.out.println("My nombre es: " + this.nombre + "guau");
	}
	
	public int getEdad () {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public static void presentacion(Perro perro) {
		
		System.out.println("Soy "+ perro.nombre + "tengo " + perro.getEdad()+ "años" + "y soy raza" + perro.raza);
	}
	
	public Perro(String familia, boolean alas, String nombre, int edad, String raza) {
		super(familia, alas);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
}