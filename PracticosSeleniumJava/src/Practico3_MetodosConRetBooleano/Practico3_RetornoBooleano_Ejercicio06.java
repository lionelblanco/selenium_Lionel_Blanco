//6)Realizar un m�todo llamado esPrimo que reciba un n�mero,
// y retorne true si solo si el n�mero es primo (es divisible entre si, y la unidad)

package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio06 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        boolean divisible = esPrimo(num);
        if (divisible == true) {
            System.out.println("El numero es Primo");
        } else {
            System.out.println("El numero no es primo");
        }

    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
}