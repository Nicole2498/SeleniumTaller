package package1;

public class clase3 {
	public static void main(String[] args) {

String nombre = "Mario";
char nombreCaracteres [] = new char [5];
char nombre2[] = {'J','u','a','n'};
//char letra = 'a';
//int numero = 10000;


nombreCaracteres [0] = 'M';
nombreCaracteres [1] = 'a';
nombreCaracteres [2] = 'r';
nombreCaracteres [3] = 'i';
nombreCaracteres [4] = 'o';
	
System.out.println(nombre); 
System.out.println(nombre2);

System.out.println(nombreCaracteres);

System.out.println(nombreCaracteres[0]);
System.out.println(nombreCaracteres.length);

for(int i = nombreCaracteres.length -1; i>=0 ; i--) {
	System.out.print(i + "=");
	System.out.print(nombreCaracteres[i]);
}

//System.out.println(nombreCaracteres);

/*{
nombreCaracteres [0] = 'M';
nombreCaracteres [1] = 'a';
nombreCaracteres [2] = 'r';
nombreCaracteres [3] = 'i';
nombreCaracteres [4] = 'o';
	*/
//System.out.printIn(nombre);
//System.out.printIn(nombre2);

//System.out.printIn(nombreCaracteres);
//System.out.println(nombreCaracteres[0]);
//System.out.println(nombreCaracteres.length);

/*for(int i = nombreCaracteres.length -1;i>=0; i--)
//System.out.print(i + "=");
	System.out.print(nombreCaracteres[i]);
	}*/
	
int arreglo[]= {45,5,7,4,19,78,1,9,10,23,2};
int auxiliar = 0; { 

for(int a = 0; a<arreglo.length; a++) {
	System.out.print(arreglo[a]+ ", ");
}
System.out.println("  ");
for(int i = 0; i<arreglo.length; i++) {
	for(int j = 0; j<arreglo.length-1; i++) {
	if (arreglo[j]>arreglo[j+1]) {
		auxiliar =arreglo[j];
		arreglo[j] = arreglo [j+1];
		arreglo [j+1] = auxiliar;
		
	}
		for(int a = 0; a<arreglo.length; a++) {
			System.out.print(arreglo[a]+", ");
		}
	System.out.println("  ");
	}
}
}
	}
}

