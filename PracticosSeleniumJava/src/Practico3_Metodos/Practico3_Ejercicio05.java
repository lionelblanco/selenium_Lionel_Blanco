//5)M�todo que reciba un n�mero entero y un n�mero double, y retorne su multiplicaci�n.
//Que tipo de retorno tiene este m�todo?



package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio05 {

	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un n�mero: ");
        int num1 = input.nextInt();

        System.out.println("Ingrese el otro n�mero: ");
        double num2 = input.nextDouble();

        System.out.println("La multiplicaci�n es " + multiplicacion(num1,num2));
    }

    public static double multiplicacion(int num1, double num2){
        double multiplicacion = num1 * num2;
        return multiplicacion;
    }
}