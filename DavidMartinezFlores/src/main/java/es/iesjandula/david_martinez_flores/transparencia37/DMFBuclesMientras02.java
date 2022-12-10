package es.iesjandula.david_martinez_flores.transparencia37;

import java.util.Scanner;

/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFBuclesMientras02 {

	public static void main(String[] args) {
		//Declaramos variables
		int result,trys=0;
		int number=((int)(Math.random()*10)+1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Encuentra el numero secreto entre de 1 y 10\n");
		
		do {//Repetir mientras result sea diferente del numero aleatorio
			
			//Minijuego del numero secreto , se te indicara si tu numero es mayor o menor
			//y veras los intentos que realizas hasta conseguir acertar el numero secreto
			trys++;
			System.out.print("\n(Intento N-["+(trys)+"]) Indique su numero -> ");
			result=sc.nextInt();

			if (number==result) {
				System.out.println("Acertaste!");
				System.out.println("Te costo -> "+trys+" Intentos!");
				break;
			}else if (result>10||result<1){
				System.out.println(+result+", No esta comprendido entre 1 y 10!");
			}else if (number<result) {
				System.out.println(+result+", Es mayor que el numero secreto!");
			}else if (number>result) {
				System.out.println(+result+", Es menor que el numero secreto!");
			}
			
		}while(result!=number);
		
		
		sc.close();//Cerramos scanner
	}

}
