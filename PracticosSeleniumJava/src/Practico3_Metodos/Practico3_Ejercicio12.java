/*12)Realizar un m�todo llamado calcularIva, que calcule el IVA (22%) dado un
n�mero float llamado sueldo, recibido por par�metro. Sugerencia: utilizar variables est�ticas.
 */

package Practico3_Metodos;

import java.util.Scanner;

public class Practico3_Ejercicio12 {

	 public static final int IVA = 22;
	    public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Ingrese el sueldo");
	        float sueldo = input.nextFloat();

	        System.out.println("El IVA de su sueldo es de " + calcularIva(sueldo));
	    }

	    public static float calcularIva(float sueldo){
	        float calculo = IVA * sueldo / 100;
	        return calculo;
	    }
	}
