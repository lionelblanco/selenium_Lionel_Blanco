/*9)Crear un m�todo que permita reciba el radio de un c�rculo, y
 retorne su area (radio^2)*PI (utilizar una variable est�tica para el valor de PI)
 */


package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio09 {

	 public static final double PI = 3.14;
	    public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Ingrese el radio del c�rculo");
	        double radio = input.nextDouble();

	        System.out.println("El �rea del c�rculo es " + areaCirculo(radio));

	    }

	    public static double areaCirculo (double radio){
	        double area =  radio * radio * PI;
	        return area;
	    }
	}