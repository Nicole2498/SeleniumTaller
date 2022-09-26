package package1;

public class Zoo2 {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato(" Perla ", 2, " American Wirehair");
		gato1.hablar();
		Gato gato2 = new Gato(" Pelusa ", 4, " Burmilla");
		//gato2.hablar();
		Gato gato3 =new Gato(" Kitty ", 3, " Munchkin" );
		gato3.nombre = "Kitty ";
		//gato3.hablar();
		
		
		//System.out.println("Mi edad es " + gato1.getEdad());
		gato1.setEdad(2);
		//System.out.println("Mi edad es " + gato1.getEdad());
	
		Gato.presentacion(gato1);
		Gato.presentacion(gato3);
		Gato.presentacion(gato2);

	}
}
