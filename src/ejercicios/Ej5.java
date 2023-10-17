package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num;

		// nos pide que escribamos un numero en pantalla
		System.out.println("ESCRIBE UN NUMERO");

		// escritura del numero
		num = sc.nextInt();

		
		//cierre de scanner
		sc.close();
	}

}
