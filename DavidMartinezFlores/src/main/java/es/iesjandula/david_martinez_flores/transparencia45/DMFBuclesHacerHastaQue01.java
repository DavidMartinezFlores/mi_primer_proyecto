package es.iesjandula.david_martinez_flores.transparencia45;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesHacerHastaQue01 {

	public static void main(String[] args) {
		//Declaracion de variables
		int number,factorial=1;//Declaramos factorial a 0 por dos cosas, 1- Para multiplicar, y 2 - por si se mete 0 el factorial de 0 es 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIndique el numero del que desea obtener el factorial: -> ");
		number=sc.nextInt();
		
		if (number <0) {
			//Caso de numero negativo
			System.out.println("No existen los factoriales negativos");
		}
		else {//Caso de numeros positivos
			for(int i = number;i>0;i--){
				factorial *=i;
			}
			System.out.println("El factorial de "+number+" es: "+factorial);
		}
		
		
		
		
		sc.close();//Cerramos scanner.
	}

}
