package notas;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author mcrui
 *
 */

public class Notas {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();

		calificacion = extracted(nota);

		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param num_nota
	 * @return
	 */
	public static String extracted(int num_nota) {
		String calificacion;
		if (num_nota >= 0 && num_nota < 5)
			calificacion = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacion = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacion = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}
