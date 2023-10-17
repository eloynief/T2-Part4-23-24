package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int numero=1;
		
		
		do {
			System.out.println(numero);
			
			numero++;
			
		}while(numero<=20);
		
		
		//cierre de scanner
		sc.close();
	}

}
