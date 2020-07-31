package Practico3_MetodosConRetBooleano;

import java.util.Scanner;

public class Practico3_RetornoBooleano_Ejercicio10 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el dato maximo");
        int max = input.nextInt();
        System.out.println("Ingrese el dato minimo");
        int min = input.nextInt();
        System.out.println("Ingrese el dato");
        int num = input.nextInt();

        if(number(num, max, min) == true) {
            System.out.println("El numero esta dentro del rango esperado y es valido");
        }
        else{
            System.out.println("El numero esta fuera de rango y no es valido");
        }
    }
    public static boolean number(int num, int max,int min){
        if (num >= min && num <= max){
            return true;
        }
        else {
            return false;
        }
    }
}