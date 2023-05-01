package PracticaGit;

import java.util.Random;

public class Password2 {
private static String generarPassword(int longitud, String contrasena) {
		
		// GENERAR CONTRASEÑA DE LONGITUD ESPECIFICADA
		    for (int i = 0; i < longitud; i++) {
		        if (Math.random() < 0.5) {
		// GENERAR UN NÚMERO ALEATORIO ENTRE 0 Y 9
		            int numero = (int) (Math.random() * 10);
		            contrasena += Integer.toString(numero);
		        } else {
		// GENERAR UNA LETRA MINÚSCULA ALEATORIA
		            char letra = (char) ((int) (Math.random() * 26) + 'a');
		            contrasena += letra;
		        }
		    }
		
			System.out.println(contrasena);
		 // DEVOLVER LA CONTRASEÑA GENERADA
		return contrasena;
		}
		
			    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz._*ñÑ";
			    public static String passwordValida(int longitud, String contrasena) {
			        Random rand = new Random();
			        StringBuilder password = new StringBuilder();
			        for (int i = 0; i < longitud; i++) {
			            char caracter = CHARACTERS.charAt(rand.nextInt(CHARACTERS.length()));
			            password.append(caracter);
			        }
			        System.out.println(contrasena);
			        return password.toString();
			    }
}
