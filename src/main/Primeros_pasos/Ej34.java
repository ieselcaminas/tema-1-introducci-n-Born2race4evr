package main.Primeros_pasos;
import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {
        int num;
        int num2;
        int resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número multiplicado");
        num = sc.nextInt();
        System.out.println("Ingrese el numero multiplicador");
        num2 = sc.nextInt();

        for (int i = 1; i <= num2 ; i++) {
            resultado = resultado + num;
        }
        System.out.println("El resultado es = " + resultado);

    }
}
