package PracticaGit;

import java.util.Random;

public class Password2 {
	static String generarPassword(int longitud) {

		String contrasena = "";

		// GENERAR CONTRASEÑA DE LONGITUD ESPECIFICADA
		for (int i = 0; i < longitud; i++) {
			int random = (int) (Math.random() * 3) + 1;
			if (random == 1) {
				// GENERAR UN NÚMERO ALEATORIO ENTRE 0 Y 9
				char[] caracteres = { 'ñ', 'Ñ', '_', '.', '*' };
				Random random2 = new Random();
				contrasena = contrasena + caracteres[random2.nextInt(caracteres.length)];
			} else if (random == 2) {
				// GENERAR UNA LETRA MINÚSCULA ALEATORIA
				char letra = (char) ((int) (Math.random() * 26) + 'a');
				contrasena += letra;
			} else {
				char letra = (char) ((int) (Math.random() * 26) + 'A');
				contrasena += letra;
			}
		}

		// DEVOLVER LA CONTRASEÑA GENERADA
		return contrasena;
	}

	public static boolean passwordValida(String contrasena) {

		boolean valido = true;
		int numMinusculas = 0;
		int numMayusculas = 0;
		int numCaracteresEspeciales = 0;

		for (int i = 0; i < contrasena.length(); i++) {
			char caracter = contrasena.charAt(i);
			if (Character.isUpperCase(caracter)) {
				// LA CONTRASEÑA CONTIENE AL MENOS UNA LETRAS MAYUSCULA
				numMayusculas++;
			} else if (Character.isLowerCase(caracter)) {
				numMinusculas++;

			} else if (caracter == 'ñ'|| caracter == 'Ñ' 
					|| caracter == '_' || caracter == '.' 
					|| caracter == '*') {
				 numCaracteresEspeciales++;
			} 

		}

		if (numMinusculas > 2 && numMayusculas > 1 && numCaracteresEspeciales > 1) {
			valido = true;
		} else {
			valido = false;
		}

		return valido;
	}

}
