//3)Método que reciba dos enteros y retorne la multiplicación de la misma.

import java.util.Scanner;

public class Practico3_Ejercicio3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el otro número: ");
        int num2 = input.nextInt();

        System.out.println("El resultado de la multiplicación es " + multiplicacion(num1,num2));
    }

    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
}



