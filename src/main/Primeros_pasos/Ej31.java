package main.Primeros_pasos;
import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.println(num + " es divisible por " + i);
            }
        }
    }
}
