package package1;

public class Pajaro extends Animal {
	int numAlas;
	
	public Pajaro(String familia, boolean alas, int numAlas) {
		super (familia, alas);
		this.numAlas = numAlas;
	}
			
public static void presentacion(Pajaro pajaro) {
		
		System.out.println("Soy un pajaro y tengo" + pajaro.alas);
	}
}
