//5)Realizar un método que retorne verdadero si el número recibido por parámetro es impar y mayor a 20


import java.util.Scanner;

public class Practico3_Ejercicio05_RetBool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        boolean impar = imparEs(num);

        if (impar == true){
            System.out.println("El numero es impar y mayor a 20");
        }
        else {
            System.out.println("El numero es par y menor a 20");
        }


    }

    public static boolean imparEs (int num){
        if (num % 2 == 1 && num > 20){
            return true;
        }else{
            return false;
        }
    }
}
