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
	 * @param cali
	 * @return
	 */
	public static String extracted(int cali) {
		String calificacion;
		if (cali >= 0 && cali < 5)
			calificacion = "Suspenso";
		else if (cali >= 5 && cali < 7)
			calificacion = "Aprobado";
		else if (cali >= 7 && cali < 9)
			calificacion = "Notable";
		else if (cali >= 9 && cali <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}
