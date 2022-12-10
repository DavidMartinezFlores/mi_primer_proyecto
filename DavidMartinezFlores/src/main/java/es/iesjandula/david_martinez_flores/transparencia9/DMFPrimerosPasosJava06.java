package es.iesjandula.david_martinez_flores.transparencia9;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/

public class DMFPrimerosPasosJava06 {

	public static void main(String[] args) {
		
		int n1,n2,n3;		//Declaramos variables
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique numero 1 para multiplicar");
		n1 = sc.nextInt();
		
		System.out.println("Indique numero 2 para multiplicar");
		n2 = sc.nextInt();
		
		System.out.println("Indique numero 3 para multiplicar");
		n3 = sc.nextInt();
		
		System.out.println("Resultado -> "+(n1*n2*n3));  //Imprimimos el resultado en la impresion ahorrando variables.
		
		sc.close(); //Cerramos scanner

	}

}
