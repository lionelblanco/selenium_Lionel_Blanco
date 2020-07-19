//9)Dado una año de nacimiento, retorne verdadero si la persona tiene 18 años o mas,
// y falso si han pasado menos años. Sugerencia: Usar una variable estática.


import java.util.Scanner;

public class Practico3_Ejercicio09_RetBool {
    private static int EDAD_DE_MAYORIA = 18;

    public static void main(String[] args) {
        boolean mayorDeEdad = esMayorDeEdad(15);
        if (mayorDeEdad == true){
            System.out.println("Es Mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }

    }
    public static boolean esMayorDeEdad (int num) {
        if (num >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

}
