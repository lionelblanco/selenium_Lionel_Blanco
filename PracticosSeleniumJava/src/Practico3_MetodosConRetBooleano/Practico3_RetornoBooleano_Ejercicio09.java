package Practico3_MetodosConRetBooleano;

public class Practico3_RetornoBooleano_Ejercicio09 {

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