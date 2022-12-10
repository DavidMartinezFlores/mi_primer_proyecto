package es.iesjandula.david_martinez_flores.pract_oblig_21_11;

import java.util.Random;

public class CalculadoraCientifica
{
	/**
	 * @param args with the arguments
	 */
	public static void main(String[] args)
	{
		int enteroAleatorio1 = generaAleatorio();
		int enteroAleatorio2 = generaAleatorio();
		
		int resultadoSuma    		= suma(enteroAleatorio1, enteroAleatorio2);
		int resultadoResta   		= resta(enteroAleatorio1, enteroAleatorio2);
		int resultadoMultiplicacion = multiplicacion(enteroAleatorio1, enteroAleatorio2);
		
		System.out.println("Resultado final suma: " + resultadoSuma);
		System.out.println("Resultado final resta: " + resultadoResta);
		System.out.println("Resultado final multiplicacion: " + resultadoMultiplicacion);
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la division de b entre a
	 */
	private static int division(int a,int b) {
		int resultado = a/b;
		if (b==0) {
			System.out.println("Lo sentimos b , no puede ser 0 , la division entre 0 es infinita");
		}
		else {
			System.out.println("El resultado de dividir " + a + " entre " + b + " es: " + resultado);
		}
		return resultado ;
	}
	
	
	/**
	 * @return un numero aleatorio
	 */
	private static int generaAleatorio()
	{
		Random random = new Random();
		
		int enteroAleatorio = random.nextInt(100);
		
		System.out.println("El entero aleatorio encontrado es: " + enteroAleatorio);
		
		return enteroAleatorio;
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la suma entre ambos números
	 */
	private static int suma(int a, int b)
	{
		int resultado = a + b;
		
		System.out.println("El resultado de la suma entre " + a + " y " + b + " es: " + resultado);
		
		return resultado ;
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la resta entre ambos números
	 */
	private static int resta(int a, int b)
	{
		int resultado = a - b;
		
		System.out.println("El resultado de la resta entre " + a + " y " + b + " es: " + resultado);
		
		return resultado ;
	}
	
	/**
	 * @param a con el primer numero
	 * @param b con el segundo numero
	 * @return la multiplicacion entre ambos números
	 */
	private static int multiplicacion(int a, int b)
	{
		int resultado = a * b;
		
		System.out.println("El resultado de la multiplicacion entre " + a + " y " + b + " es: " + resultado);
		
		return resultado ;
	}
}