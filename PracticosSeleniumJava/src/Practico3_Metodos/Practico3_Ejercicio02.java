//2)Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20, “Es mayor a 20”.
// De lo contrario, imprimir “No es mayor a 20”.
package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio02 {

	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = input.nextInt();

        if (esMayor(numero) == true) {
            System.out.println("El numero ingresado es mayor a 20");
        } else {
            System.out.println("El numero ingresado es menor a 20");
        }

    }

    public static boolean esMayor(int numero) {
        if (numero > 20) {
            return true;
        } else {
            return false;
        }
    }
}