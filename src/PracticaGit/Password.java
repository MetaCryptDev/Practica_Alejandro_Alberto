package PracticaGit;

public class Password {
	
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
		

		private static boolean passwordValida(String contrasena) {
			 boolean valido = true;
			    int numMinusculas = 0;
			    
			    for (int i = 0; i < contrasena.length(); i++) {
			        char caracter = contrasena.charAt(i);
			        if (Character.isUpperCase(caracter)) {
			 // LA CONTRASEÑA CONTIENE AL MENOS UNA LETRAS MAYUSCULA
			        } else if (Character.isLowerCase(caracter)) {
			            numMinusculas++;
			            if (numMinusculas <= 2) {
			// LA CONTRASÑEA CONTIENE AL MENOS 3 LETRAS MINUSCULAS
			            } else {
			               valido = false;
			            }
			        } else if (Character.isDigit(caracter)) {
			// LA CONTRASEÑA CONTIENE AL MENOS UN NUMERO
			        } else {
			            valido = false;
			        }
			    }
			    
			    return valido && numMinusculas >2;
			
			
		}

}
