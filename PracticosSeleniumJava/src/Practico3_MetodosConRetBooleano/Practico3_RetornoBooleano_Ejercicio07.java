//7)Realizar un método que reciba dos números enteros y retorne verdadero si la suma es mayor a 100.
//De lo contrario, debe retornar falso.

package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio07 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresar un numero");
        int num1 = input.nextInt();
        System.out.println("Ingresar Otro Numero");
        int num2 = input.nextInt();

        boolean mayor = mayoACien(num1,num2);

        if (mayor == true){
            System.out.println("El numero es mayo a 100");
        }else {
            System.out.println("El numero es menor a 100");
        }

    }
    public static boolean mayoACien (int num1, int num2){
        if (num1 + num2 > 100){
            return true;
        }else{
            return false;

        }
    }
}