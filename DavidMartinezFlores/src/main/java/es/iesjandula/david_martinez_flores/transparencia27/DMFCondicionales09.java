package es.iesjandula.david_martinez_flores.transparencia27;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales09 {

	public static void main(String[] args) {
		
		//Declaracion de varaibles
		int number;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Indique numero a evaluar: ");
			number=sc.nextInt();
			
			if(number>99999||number<0) { //Ponemos la condicional de solo numeros de hasta 5 cifras y positivos
				System.out.println("Solo se admiten numeros de hasta 5 cifras y positivos");
			}
		}while(number>99999||number<0);//Repetir mientras
		
		if(number>99999||number<0){
			System.out.println("Solo se admiten numeros de hasta 5 cifras y positivos");
		}else{
			//Posibilidades de hasta 5 cifras
			number = (number>=100000) ? number/10:number;
			number = (number>=10000) ? number/10:number;
			number = (number>=1000) ? number/10:number;
			number = (number>=100) ? number/10:number;
			number = (number>=10) ? number/10:number;
		
		
			System.out.println("La primera cifra es -> "+number);
		
		}
		sc.close();//Cerramos scanner.
	}

}
