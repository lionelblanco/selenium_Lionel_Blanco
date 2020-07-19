//11)Crear un método que reciba un entero, y muestre en pantalla la cantidad de dólares y
// de euros que representa ese número

import java.util.Scanner;

public class Practico3_Ejercicio11 {
    public static float EURO = 50;
    public static float DOLAR = 42;

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        float numero = input.nextFloat();
        conversionMonedas(22);
    }

    public static void conversionMonedas(int numero){
        System.out.println(numero / EURO);
        System.out.println(numero / DOLAR);

    }
}
