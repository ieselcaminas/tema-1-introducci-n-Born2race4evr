package main.Nuevos_Ejercicios;

public class Es_Divisible {
    public static boolean  numeros_divisibles (int num1, int num2){
        if (num1 % num2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String argv[]) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

        if (numeros_divisibles(numero, numero2)) {
            System.out.println("Es divisible");
        }else {
            System.out.println("No es divisible");
        }





    }
}

