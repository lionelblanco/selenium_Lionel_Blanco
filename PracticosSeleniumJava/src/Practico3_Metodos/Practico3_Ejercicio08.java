//8)Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.

package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio08 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        if (par(num) == true){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
    public static boolean par (int num){
        if (num%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}