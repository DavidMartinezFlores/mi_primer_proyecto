package es.iesjandula.david_martinez_flores.transparencia37;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesMientras01 {

	public static void main(String[] args) {
		//Declaracion de variables
		int numeroImpresion;
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos cantidad de asteriscos
		do {
			System.out.print("Indique la cantidad de asteriscos que desea imprimir: -> ");
			numeroImpresion=sc.nextInt();
			
			if(numeroImpresion<=0){//Asteriscos solo si es mayor que 0
				System.out.println("\n** No se puden imprimir asteriscos con de 0 o inferior **\n");
			}
		}while(numeroImpresion<=0);//Controlador do while
		
		//For iterador de impresiones 
		for (int i = 1;i<=numeroImpresion;i++){
			System.out.print(" *");
			
			//Cada 30 asteriscos imprimir un salto de linea para evitar una linea enorme de asteriscos.
			if(i%30==0) {
				System.out.println();
			}
			
		}

		sc.close();//Cerramos scanner
	}

}
