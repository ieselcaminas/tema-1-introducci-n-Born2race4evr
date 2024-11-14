package main.Primeros_pasos;
import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        //factorial de un número = 1 * 2 * 3 * 4 * 5
        long factorial = 1;
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();


        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial );
    }
}
