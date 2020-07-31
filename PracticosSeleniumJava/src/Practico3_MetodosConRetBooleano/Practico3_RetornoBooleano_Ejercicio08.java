/*08)Realizar un método llamado esMayor que reciba un número, y retorne verdadero si el número es mayor a 0,
de lo contrario, se debe retornar falso. Luego, solicitar al usuario que ingrese un número.
Sii es positivo, se debe imprimir: “El número es positivo”, de lo contrario,
“El número es negativo” (Se debe utilizar el método realizado anteriormente)*/


package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio08 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar Un numero");
        int num = input.nextInt();

        boolean mayor = esMayor(num);

        if (mayor == true){
            System.out.println("El numero es positivo");
        }else {
            System.out.println("El numero es negativo");

        }

    }
    public static boolean esMayor (int num){
        if (num > 0){
            return true;
        }else {
            return false;
        }
    }
}