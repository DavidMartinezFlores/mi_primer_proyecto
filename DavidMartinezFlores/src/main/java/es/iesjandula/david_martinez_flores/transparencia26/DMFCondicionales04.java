package es.iesjandula.david_martinez_flores.transparencia26;

import java.util.Scanner;
/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales04 {

	public static void main(String[] args) {
		
		//Declaramos variables
		int a,b,x;
		Scanner sc = new Scanner(System.in);
				
		//Imprimimos formula y pedimos valores
		
		System.out.print("Indique valores de (A) ,(B) para resolver Resolver [ax+b=??] (Despejando la X)\n"
				+ "A: ");
		a = sc.nextInt();
		
		
		System.out.print("B:");
		b = sc.nextInt();
	
		if (a>0) {
			x=(-b)/a;
			System.out.println("Resultado -> : ("+(a)+"*"+(x)+")+"+(b)+" = "+((a*x)+b));
		}
		else {
			System.out.println("Lo sentimos , A no puede ser inferior o igual a 0 ");
		}
		
		sc.close(); //Cerramos el scanner
	}

}
