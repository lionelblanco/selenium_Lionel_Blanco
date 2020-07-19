//10)Crear un método que permita reciba el alto y ancho de un paralelogramo tipo,y retorne su area.

import java.util.Scanner;

public class Practico3_Ejercicio10 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el alto");
        float alto = input.nextFloat();
        System.out.println("Ingrese el ancho");
        float ancho = input.nextFloat();

        System.out.println("El area del paralelogramo es "+ areaPararelogramoTipo(alto,ancho));

    }

    public static float areaPararelogramoTipo(float alto, float ancho){
        float area = alto * ancho;
        return area;
    }
}
