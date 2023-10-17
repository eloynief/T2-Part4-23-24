package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		int num,multi=1,res;
		
		// nos pide que escribamos un numero en pantalla
		System.out.println("ESCRIBE UN NUMERO");
		
		// escritura del numero
		num = sc.nextInt();
		
		do {
			res=num*multi;
			System.out.println(res);
			
			multi++;
			
		}while(multi<=10);
		
		//cierre de scanner
		sc.close();
	}

}
