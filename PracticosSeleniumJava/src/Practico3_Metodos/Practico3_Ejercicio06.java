package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio06 {
	public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

	System.out.println("Ingrese un n�mero: ");
	int num1 = input.nextInt();

	System.out.println("Ingrese el otro n�mero: ");
	int num2 = input.nextInt();
    
	if (mayorDeDosNumeros(num1, num2) == true) {
	   System.out.println("El mayor de los dos n�meros es: " + num1);
	  } else {
	   System.out.println("El mayor de los dos n�meros es: " + num2);
	        }
	    }

	    public static boolean mayorDeDosNumeros(int num1, int num2) {
	        if (num1 > num2) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	}