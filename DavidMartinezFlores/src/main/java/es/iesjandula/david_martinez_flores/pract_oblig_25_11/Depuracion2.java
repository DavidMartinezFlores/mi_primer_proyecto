package es.iesjandula.david_martinez_flores.pract_oblig_25_11;

public class Depuracion2 {

	private static String code1 = ":@A=",code2 =">;?<",code3="BC:@";
	
	public static void main(String[] args) 
	{
		// You cannot write any code here
		System.out.println();
	}
	
	/**
	 * Firstly, you have to decrypt every code
	 */
	public static void decrypter(String code)
	{
		for(int i=0;i<code.length();i++) 
		{
			char charDecrypted = (char) (code.charAt(i) - 10);
			System.out.println(charDecrypted);
		}
	}
	/**
	 * Secondly,use the decrypted code to get the secret code
	 */
	public static void crackingCode(String descryptedCode) 
	{
		// secretCode must be assigned to
		// descryptedCode.hasCode() to get
		// the secret code
		int secretCode =-1;
		
		if(secretCode == 1724615) 
		{
			System.out.println("Code cracked");
		}
	}
}
