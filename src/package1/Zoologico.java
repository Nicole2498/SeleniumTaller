package package1;

public class Zoologico {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Mamífero", false , "Rex", 4, "pastor aleman");
		perro1.hablar();
		Perro perro2 = new Perro("Mamífero", false , "firulais", 6, "French Puddle");
		//perro2.hablar();
		Perro perro3 = new Perro("Mamífero", false); 
		perro3.nombre = "Rex3";
		//perro3.hablar();
		Animal perro4 = new Perro( "mamífero", false);
		Animal pajaro = new Pajaro ("Ave", true, 2);
		Animal pajaro1 = new Pajaro ("Ave", true, 4);
		
		pajaro.presentaion(pajaro);
		pajaro.presentaion(pajaro1);
		
		Perro.presentacion(perro1);
		Perro.presentacion(perro3);
		Perro.presentacion(perro2);
	
	
	}
}
