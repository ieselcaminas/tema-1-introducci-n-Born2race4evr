package main.Primeros_pasos;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int num;
        int positives = 0;
        Scanner sc = new Scanner(System.in);

        do {
            num = sc.nextInt();
            if (num > 0) {
                positives = positives + 1;
            }
        }while (num != 0);
        System.out.println("Positivos: " + positives);
    }
}