/*08)Realizar un m�todo llamado esMayor que reciba un n�mero, y retorne verdadero si el n�mero es mayor a 0,
de lo contrario, se debe retornar falso. Luego, solicitar al usuario que ingrese un n�mero.
Sii es positivo, se debe imprimir: �El n�mero es positivo�, de lo contrario,
�El n�mero es negativo� (Se debe utilizar el m�todo realizado anteriormente)*/


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