package es.iesjandula.david_martinez_flores.transparencia26;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales06 {

	public static void main(String[] args) {
		
		int n1=0,n2=0,n3=0,selection=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique numero 1: ");
		n1=sc.nextInt();
		
		System.out.print("Indique numero 2: ");
		n2=sc.nextInt();
		
		System.out.print("Indique numero 3: ");
		n3=sc.nextInt();
		
		do {
			System.out.print("\nSeleccione un tipo de orden:\n"
					+ "[1] De mayor a menor\n"
					+ "[2] De menor a mayor\n");
			System.out.print("\nSeleccion -> ");
			selection=sc.nextInt();
			//DO WHILE PARA EVITAR ELECCION DIFERENTE DE 1 O 2
			
			if (selection!=1 && selection!=2) {
				System.out.println("Solamente puede seleccionar 1 o 2 !!");
			}
		}while(selection!=1 && selection!=2);
		
		
		switch(selection) {
			case 1:{
				//CASOS POSIBLES DE MAYOR A MENOR
				
				if (n1>n2 && n1>n3) {
					if (n2>n3) {
						System.out.println("Ordenados de Mayor a menor -> "+n1+" "+n2+" "+n3);
					}
					else {
						System.out.println("Ordenados de Mayor a menor -> "+n1+" "+n3+" "+n2);
					}
				}
				else if (n2>n1 && n2>n3) {
					if (n1>n3) {
						System.out.println("Ordenados de Mayor a menor -> "+n2+" "+n1+" "+n3);
					}
					else {
						System.out.println("Ordenados de Mayor a menor -> "+n2+" "+n3+" "+n1);
					}
				}
				else if (n3>n1 && n3>n2) {
					if (n2>n1) {
						System.out.println("Ordenados de Mayor a menor -> "+n3+" "+n2+" "+n1);
					}
					else {
						System.out.println("Ordenados de Mayor a menor -> "+n3+" "+n1+" "+n2);
					}
				}
				//CASOS POSIBLES DE IGUALDAD ALGUNOS CASOS SE OMITEN PORQUE PODRIAN SER REDUNDANTES AL SER 3 NUMEROS
				
				else if((n1 == n2 && n1>n3)){
					System.out.println("Ordenados de Mayor a menor -> "+n1+" "+n2+" "+n3);
				}
				else if((n3 == n2 && n1<n3)){
					System.out.println("Ordenados de Mayor a menor -> "+n3+" "+n2+" "+n1);
				}
				else if((n1 == n3 && n1>n2)){
					System.out.println("Ordenados de Mayor a menor -> "+n1+" "+n3+" "+n2);
				}
				else if((n1 == n3 && n1<n2)){
					System.out.println("Ordenados de Mayor a menor -> "+n2+" "+n1+" "+n3);
				}
				
				
				break;	
			}
			case 2:{
				//CASOS POSIBLES DE MENOR A MAYOR
				
				if (n1<n2 && n1<n3) {
					if (n2<n3) {
						System.out.println("Ordenados de Menor a mayor -> "+n1+" "+n2+" "+n3);
					}
					else {
						System.out.println("Ordenados de Menor a mayor -> "+n1+" "+n3+" "+n2);
					}
				}
				else if (n2<n1 && n2<n3) {
					if (n1<n3) {
						System.out.println("Ordenados de Menor a mayor -> "+n2+" "+n1+" "+n3);
					}
					else {
						System.out.println("Ordenados de Menor a mayor -> "+n2+" "+n3+" "+n1);
					}
				}
				else if (n3<n1 && n3<n2) {
					if (n2<n1) {
						System.out.println("Ordenados de Menor a mayor -> "+n3+" "+n2+" "+n1);
					}
					else {
						System.out.println("Ordenados de Menor a mayor -> "+n3+" "+n1+" "+n2);
					}
				}
				
				//CASOS POSIBLES DE IGUALDAD ALGUNOS CASOS SE OMITEN PORQUE PODRIAN SER REDUNDANTES AL SER 3 NUMEROS
				
				else if((n1 == n2 && n1<n3)){
					System.out.println("Ordenados de Menor a mayor -> "+n1+" "+n2+" "+n3);
				}
				else if((n3 == n2 && n1>n3)){
					System.out.println("Ordenados de Menor a mayor -> "+n3+" "+n2+" "+n1);
				}
				else if((n1 == n3 && n1<n2)){
					System.out.println("Ordenados de Menor a mayor -> "+n1+" "+n3+" "+n2);
				}
				else if((n1 == n3 && n1>n2)){
					System.out.println("Ordenados de Menor a mayor -> "+n2+" "+n1+" "+n3);
				}
				break;		
			}
			default:{System.out.println("Error Inesperado NoSelectionPossible");
				break;
			}
		
		}

		sc.close();//Cerramos Scanner
	}

}
