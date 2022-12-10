package es.iesjandula.david_martinez_flores.transparencia8;
/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
import java.util.Scanner;

public class DMFPrimerosPasosJava02 {

	public static void main(String[] args) {
		
		//Mostramos 10 palabras en ingles y su traduccion , mediante un minijuego de hacertar palabras.
	 
		int cont=0;
		String valorSelected;
		String [] valorES= {"Cliente","Disco","Ventana","Teclado","Raton","Pantalla","Servidor","Paquete","Clase","Publico"};
		Scanner sc = new Scanner(System.in);
		System.out.println("En este Ejercicio, Mostraremos 10 palabra en ingles con su correspodiente traduccion , de una manera amena.\n"
				+ "Para ello el programa pedira al usuario la traduccion, si es correcto sumara puntos , de lo contrario no sumara.\n\n"
				+ "! ***** Se tiene que tener en cuenta mayusculas ***** ! -> House es Casa\n (No utilizar tildes)");
		System.out.println("La palaba -> Client , su traduccion es ???? : ");
		valorSelected=sc.nextLine();
		if (valorSelected.equals(valorES[0])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[0]);
		}
		System.out.println("La palaba -> Window , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[2])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[2]);
		}
		
		System.out.println("La palaba -> Disk , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[1])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[1]);
		}
		
		System.out.println("La palaba -> Keyboard , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[3])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[3]);
		}
		
		System.out.println("La palaba -> Mouse , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[4])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[4]);
		}
		
		System.out.println("La palaba -> Screen , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[5])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[5]);
		}
		
		System.out.println("La palaba -> Server , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[6])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[6]);
		}
		
		System.out.println("La palaba -> Package , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[7])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[7]);
		}
		
		System.out.println("La palaba -> Class , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[8])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: "+valorES[8]);
		}
		
		System.out.println("La palaba -> Public , su traduccion es ???? :  ");
		valorSelected=sc.nextLine();
		
		if (valorSelected.equals(valorES[9])) {
			System.out.println("Has acertado! ");
			cont++;
		}
		else {
			System.out.println("Lo sentimos, la traduccion es: Cliente\n");
		}
		
		
		System.out.println("Has acertado un total de -> "+cont+" Palabras  "+cont+"/10\n");
		
		sc.close();  //Cerramos el scanner
	}

}
