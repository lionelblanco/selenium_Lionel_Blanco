//04)Realizar un m�todo que retorne verdadero si el n�mero recibido por par�metro es impar

package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio04 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        boolean impar = esImpar(num);

        if (impar == true) {
            System.out.println("El numero es impar");
        } else {
            System.out.println("El numero es par ");
        }
    }

    public static boolean esImpar(int num) {
        if (num % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}