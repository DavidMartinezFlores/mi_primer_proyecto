package es.iesjandula.david_martinez_flores.transparencia9;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/

public class DMFPrimerosPasosJava09 {

	public static void main(String[] args) {
		// 1 EUR = 1.66.386 ptas, conversor de EUR a PTAS
		
		final double PTAS1=166.386;		//Declaramos variable double para decimales (Numero reales)
		double eur;						//Utilizamos PTAS1 como constante, pues siempre sera el mismo valor.
		Scanner sc = new Scanner(System.in);  
		
		System.out.print("Euros para convertir : ->");
		eur=sc.nextInt();
		
		System.out.println("("+eur+" Euros) Pesetas totales --> "+(eur*PTAS1)+" Ptas"); //Imprimimos resultado
		
		sc.close(); //Cerramos Scanner
		
	}

}
