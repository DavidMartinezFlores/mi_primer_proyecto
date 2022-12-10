
package es.iesjandula.david_martinez_flores.pract_oblig_23_11;
public class Depuracion1 {

	public static void main(String[] args) 
	{
		String usuario = "ninguno";
		String password = "ninguna";
		
		boolean accesoSistema = false;
		
		if(usuario.equals("usuarioSecreto") && password.equals("contraseñaSecreta")) 
		{
			accesoSistema=true;
			System.out.println("Acceso al sistema realizado");
			
		}
		else 
		{
			System.out.println("Aviso al personal de vigilancia");
		}
		
		boolean accesoAlNumeroSecreto = false;
		
		if(accesoSistema) 
		{
			int numeroSecreto = 10;
			
			if(numeroSecreto==20) 
			{
				accesoAlNumeroSecreto=true;
				//METODO COMENTADO POR SEGURIDAD -> APERTURA DE COMPUERTA
			}
		}
	}
	
	public static void aperturaDeCompuerta() 
	{
		System.out.println("Apertura de compuerta realizada");
	}
}
