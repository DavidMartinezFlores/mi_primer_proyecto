package es.iesjandula.david_martinez_flores.transparencia45;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesHacerHastaQue04 {

	public static void main(String[] args) {
		//Declaracion de variables
		int x,y,cont=0,resto=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime numero X e Y , para Dividir mediante restas:\n");
		System.out.print("X (Cantidad a dividir): -> ");
		x=sc.nextInt();
		
		System.out.print("Y (Valor entre el que dividir la cantidad X): -> ");
		y=sc.nextInt();
		
		//Acumulamos un contador para saber las veces que se resta i.
		//Tras ello el resto lo sacamos en restar i - y, continuamente.
		for (int i= x;i>=y;i-=y){
			cont++;
			resto=i-y;
		}
		
		System.out.println("X entre Y es -> "+cont+" Resto es "+resto);
		
		sc.close();//Cerramos scanner
	}

}
