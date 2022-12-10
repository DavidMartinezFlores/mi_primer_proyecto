package es.iesjandula.david_martinez_flores.transparencia27;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales08 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Indique numero a evaluar: ");
		number=sc.nextInt();
		
		
		//Si )
		if(number>0) {
			
			//Si el numero es mayor o igual a 10 , sacar el resto de numero entre numero/10.
			//Si no se cumple, es porque es un numero de 1 cirfra, por lo tanto dejarlo con su valor.
			
			number = (number>=10) ? number%(number/10):number;
			System.out.println("La ultima cifra es: "+number);
		}
		else {
			System.out.println("Solo se admiten numeros positivos");
		}
		
		sc.close();
	}

}
