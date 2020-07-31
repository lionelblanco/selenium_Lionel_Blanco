//7)Crear un método que reciba un número entero n, y muestre en pantalla la suma desde 1 hasta ese número n. Ej.
//Si n es 4, se debe mostrar en pantalla 10.


package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio07 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresar un numero");
        int num = input.nextInt();

        System.out.println("la suma desde el 1 hasta el numero ingresado es " + sumar(num));

    }

    public static int sumar (int num){
        int sumar = 0;
        for (int i=1; i<=num; i++){
            sumar = sumar + i;
        }
        return sumar;
    }

}