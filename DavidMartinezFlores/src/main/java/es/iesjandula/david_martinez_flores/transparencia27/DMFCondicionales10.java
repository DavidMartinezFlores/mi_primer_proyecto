package es.iesjandula.david_martinez_flores.transparencia27;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales10 {

	public static void main(String[] args) {
		
		//Declaracion de varaibles
		int number;
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Indique numero a evaluar entre [99999 - (-99999)]  (5 cifras): ");
		number=sc.nextInt();
		
		if(number>=0) {
			if(number>99999) { //Imprimimos los casos de 5 cifras maximo positivos
				System.out.println("Este numero Tiene mas 5 cifras , no se puede evaluar");
			}
			else if (number>=10000) { 
				System.out.println("Tiene un total de : 5 Cifras");
			}
			else if (number>=1000) { 
				System.out.println("Tiene un total de : 4 Cifras");
			}
			else if(number>=100) { 
				System.out.println("Tiene un total de : 3 Cifras");
			}
			else if(number>=10) { 
				System.out.println("Tiene un total de : 2 Cifras");
			}
			else if(number<10) { 
				System.out.println("Tiene un total de : 1 Cifra");
			}
			
			
		}
		else {
			if(number<-99999) {  //Imprimimos los casos de 5 cifras maximo negativos
				System.out.println("Este numero Tiene mas 5 cifras , no se puede evaluar");
			}
			else if (number<=-10000) { 
				System.out.println("Tiene un total de : 5 Cifras");
			}
			else if (number<=-1000) { 
				System.out.println("Tiene un total de : 4 Cifras");
			}
			else if(number<=-100) { 
				System.out.println("Tiene un total de : 3 Cifras");
			}
			else if(number<=-10) { 
				System.out.println("Tiene un total de : 2 Cifras");
			}
			else if(number>-10) { 
				System.out.println("Tiene un total de : 1 Cifra");
			}
		
		
		
		sc.close();//Cerramos Scanner
		}
	}
}
