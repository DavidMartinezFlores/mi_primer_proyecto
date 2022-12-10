package es.iesjandula.david_martinez_flores.transparencia27;

import java.util.Scanner;
/**
 ********************************************
 * @author David , 1 º DAM 2022, IES JANDULA*
 ********************************************/
public class DMFCondicionales11 {

	public static void main(String[] args) {
		//Declaracion de varaibles
		int number,part1,part2,part3,part4,part5;
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Indique numero a evaluar si es capicua o no entre [0-99999]: ");
		number=sc.nextInt();
		
		//Sacamos cada unidad
		part5=(number/10000);
		part4=(number%10000)/1000;
		part3=(number%1000)/100;
		part2=(number%100)/10;
		part1=(number%10);
		
		//Casos posibles
		if(number>99999) {//Salida de error / solo 5 cifras
			System.out.println("Lo sentimos solo se admiten numeros de hasta 5 cifras");
			}
		else if(number == ((part5)+(part4*10)+(part3*100)+(part2*1000)+(part1*10000))) {
			System.out.println(+number+" Es capicua");
		}
		else if(number == ((part4)+(part3*10)+(part2*100)+(part1*1000))) {
			System.out.println(+number+" Es capicua");
		}
		else if(number == ((part3)+(part2*10)+(part1*100))) {
			System.out.println(+number+" Es capicua");
		}
		else if(number == ((part2)+(part1*10))) {
			System.out.println(+number+" Es capicua");
		}
		else if(number == ((part1))) {
			System.out.println(+number+" Es capicua");
		}
		else {
			System.out.println(+number+" No es capicua");
		}
		
		
		sc.close();//Cerramos Scanner
	}

}


