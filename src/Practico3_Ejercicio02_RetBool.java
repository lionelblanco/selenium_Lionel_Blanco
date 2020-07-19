//02)Dado un numero, retorne verdadero si el número es menor a 0.

import java.util.Scanner;

public class Practico3_Ejercicio02_RetBool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        boolean menorACero = numeroMenorQueCero(num);

        if (menorACero == true) {
            System.out.println("El Numero es menor a 0");
        }else {
            System.out.println("El numero es mayor o igual a 0");
        }

    }
    public static boolean numeroMenorQueCero(int numero) {
        if (numero < 0) {
            return true;
        } else
            return false;
    }
}
