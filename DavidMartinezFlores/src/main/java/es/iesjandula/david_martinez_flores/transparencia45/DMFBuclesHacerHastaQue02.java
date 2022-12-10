package es.iesjandula.david_martinez_flores.transparencia45;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesHacerHastaQue02 {

	public static void main(String[] args) {
		//Declaracion de variables
		double base,exp,calculo;
		boolean negativeExp=false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nIndique el numero base (X): -> ");
		base=sc.nextDouble();
		
		calculo=base;//asignamos el valor de la base a calculo para usar base como numero aparte.
		
		System.out.print("\nIndique el numero exponente (Y): -> ");
		exp=sc.nextDouble();
		
		//Caso de exponente negativo preparativos
		if (exp<0) {
			negativeExp=true;
			exp=Math.abs(exp);
		}

		//Multiplicamos la base por la base y la acumulamos tantas veces como el exponenete indique
		for(int i = 1;i<exp;i++){
			calculo *=base; 
		}
		
		//Accion en caso de exponente negativo
		if (negativeExp==true) {
			calculo = 1/calculo;
		}
		
		//Accion en caso de base negativa
		
		System.out.println("El resultado de "+base+" elevado a "+exp+" es: -> "+calculo);
		
		sc.close();//Cerramos Scanner
	}

}
