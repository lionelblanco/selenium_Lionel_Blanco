//6)Realizar un método que reciba dos números y retorne el mayor ambos

import java.util.Scanner;

public class Practico3_Ejercicio6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el otro número: ");
        int num2 = input.nextInt();

        if (mayorDeDosNumeros(num1, num2) == true) {
            System.out.println("El mayor de los dos números es: " + num1);
        } else {
            System.out.println("El mayor de los dos números es: " + num2);
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
