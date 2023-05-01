package PracticaGit;

public class Password {

	static String generarPassword(int longitud) {
		String contrasena = "";

		// GENERAR CONTRASEÑA DE LONGITUD ESPECIFICADA
		for (int i = 0; i < longitud; i++) {
			int random = (int) (Math.random() * 3) + 1;
			if (random == 1) {
				// GENERAR UN NÚMERO ALEATORIO ENTRE 0 Y 9
				int numero = (int) (Math.random() * 10);
				contrasena += Integer.toString(numero);
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

	static boolean passwordValida(String contrasena) {
		boolean valido = true;
		int numMinusculas = 0;
		int numMayusculas = 0;
		int numNumeros = 0;

		for (int i = 0; i < contrasena.length(); i++) {
			char caracter = contrasena.charAt(i);
			if (Character.isUpperCase(caracter)) {
				numMayusculas++;
				// LA CONTRASEÑA CONTIENE AL MENOS UNA LETRAS MAYUSCULA
			} else if (Character.isLowerCase(caracter)) {
				numMinusculas++;
				if (numMinusculas <= 2) {
					// LA CONTRASÑEA CONTIENE AL MENOS 3 LETRAS MINUSCULAS
				} else {
					valido = false;
				}
			} else if (Character.isDigit(caracter)) {
				numNumeros++;
				// LA CONTRASEÑA CONTIENE AL MENOS UN NUMERO
			} else {
				valido = false;
			}

		}
		if (numMinusculas > 2 && numMayusculas > 1 && numNumeros > 1) {
			valido = true;
		} else {
			valido = false;
		}

		return valido;
	}

}
