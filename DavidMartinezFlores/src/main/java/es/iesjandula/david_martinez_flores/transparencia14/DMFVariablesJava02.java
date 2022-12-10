package es.iesjandula.david_martinez_flores.transparencia14;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFVariablesJava02 {

	public static void main(String[] args) {
		
		//Practica parecida a practica de transparencia 9 , (practica numero 09)
		//Utilizamos nombres de variables diferentes para que no sean iguales totalmente.
		
				final double PTASPOREURO=166.386;		//Declaramos variables double para decimales
				double euros,eurosConvertidos;						   // Utilizamos PTASPOREURO como constante,siempre tendra el mismo valor.
				
				Scanner sc = new Scanner(System.in);  
				
				System.out.print("Euros para convertir a Ptas : ->");
				euros=sc.nextInt();
				
				//Asignamos el calculo de euros a ptas en una variable
				
				eurosConvertidos=euros*PTASPOREURO;
				
				System.out.println("("+euros+" Euros) Pesetas totales --> "+(eurosConvertidos)+" Ptas"); 
				
				sc.close(); //Cerramos Scanner

	}

}
