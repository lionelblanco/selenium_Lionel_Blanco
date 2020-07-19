//4)Método que reciba dos números y retorne su suma

import java.util.Scanner;

public class Practico3_Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese Un Numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese Un Numero nuevamente : ");
        int num2 = input.nextInt();

        System.out.println("El total de la suma es " + sumar(num1,num2));


    }

    public static int sumar (int num1,int num2){
        return num1 + num2;
    }
}

