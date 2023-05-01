package PracticaGit;

import java.util.Scanner;

public class Main {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("¿De que longitud quieres la contraseña?");
		int longitud = sc.nextInt();
		
		String contrasena = Password.generarPassword(longitud);
		boolean valido = Password.passwordValida(contrasena);
		
		System.out.println(contrasena + " + " + valido);
		
		String contrasena2 = Password2.generarPassword(longitud);
		boolean valido2 = Password2.passwordValida(contrasena2);
		
		System.out.println(contrasena2 + " + " + valido2);


	}

}
