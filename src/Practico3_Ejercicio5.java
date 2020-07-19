//5)Método que reciba un número entero y un número double, y retorne su multiplicación.
//Que tipo de retorno tiene este método?

import java.util.Scanner;

public class Practico3_Ejercicio5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el otro número: ");
        double num2 = input.nextDouble();

        System.out.println("La multiplicación es " + multiplicacion(num1,num2));
    }

    public static double multiplicacion(int num1, double num2){
        double multiplicacion = num1 * num2;
        return multiplicacion;
    }
}
