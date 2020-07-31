//3)Método que retorne verdadero si el número recibido por parámetro es mayor a 18. De lo contrario, se debe retornar falso.


package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio03 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        boolean mayor = mayor18(num);

        if (mayor == true) { 
            System.out.println("El numero es mayor a 18");
        }else{
            System.out.println("El numero es menor a 18");
        }

    }

    public static boolean mayor18 (int num) {
        if (num > 18) {
            return true;
        }else{
            return false;
        }
    }

}