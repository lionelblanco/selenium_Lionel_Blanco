//1)Escribir un método que reciba un número y retorne su doble

package Practico3_Metodos;

public class Practico3_Ejercicio01 {

	public static void main(String args[]) {
        int duplicate = calculateDouble(7);
        System.out.println("El doble del numero es " + duplicate);

    }

    public static int calculateDouble (int num) {
        return num * 2;
    }
}
