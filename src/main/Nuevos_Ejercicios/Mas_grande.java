package main.Nuevos_Ejercicios;


//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos.
public class Mas_grande {
    public static int MasGrande(int a, int b) {
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }
    public static void main(String argv[]) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");
        int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

        int elMasGrande = MasGrande(numero, numero2);

        System.out.println("El número más grande es: " + elMasGrande);


    }
}