//1)Método que reciba dos números y retorne verdadero si el primer numero es mayor que el segundo.
// De lo contrario, retornar debe retornar falso.

package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio01 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = input.nextInt();

        System.out.println("Ingrese un numero");
        int numero2 = input.nextInt(); 

        boolean primeroMayorQueSegundo = esMayor(numero1,numero2);
        if (primeroMayorQueSegundo == true) {
            System.out.println("El numero1 es mayor que el numero 2");
        } else{
            System.out.println("El numero1 es menor que el numero 2");
        }

    }

    public static boolean esMayor (int num1, int num2) {
        if (num1 > num2) {
            return true;
        }else {
            return false;

        }
    }
}