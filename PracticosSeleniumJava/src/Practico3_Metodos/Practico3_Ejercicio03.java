

package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio03 {

	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un n�mero: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el otro n�mero: ");
        int num2 = input.nextInt();

        System.out.println("El resultado de la multiplicaci�n es " + multiplicacion(num1,num2));
    }

    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
}