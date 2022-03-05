package notas;

import java.util.Scanner;

public class Notas {

public static void main (String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir números por teclado
int nota = 0;
String calificacion = "";
System.out.print("Introduzca una nota: ");
nota = reader.nextInt();

calificacion = notas.califica.califica(nota);

System.out.println(calificacion);
reader.close();
}
}