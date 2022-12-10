package es.iesjandula.david_martinez_flores.transparencia9;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/

public class DMFPrimerosPasosJava08 {

	public static void main(String[] args) {
		
		int x,y;
		Scanner sc = new Scanner(System.in);  //Declaramos variables
		
		System.out.print("Indique valor de X: ->");
		x=sc.nextInt();
		
		System.out.print("Indique valor de Y: ->");
		y=sc.nextInt();
		
		System.out.println("\nSuma X + Y = "+(x+y)+"\n" //Utilizamoa cracteres especiales para usar solo una instrucion de impresion.
				+ "Resta X - Y = "+(x-y)+"\n"
				+ "Multiplicacion X * Y = "+(x*y)+"\n"//Mostramos los resultados en la impresion, ahorrando variables
				+ "Division X / Y = "+(x/y)+"\n"
				+ "Resto X % Y = "+(x%y)+"\n"
				+ "Potencia , base X elevado Y = "+(Math.pow(x, y))+"\n"
				+ "Raiz de X + Raiz de Y = "+(Math.sqrt(x)+Math.sqrt(y))+"\n"
				+ "");						//Sacamos la raiz cuadrada del numero X y del numero Y, tras eso las sumamos.
				
		sc.close();	//Cerramos Scanner
	}				

}
