package main.Primeros_pasos;
import java.util.Scanner;
import java.util.Random;

public class Ej38 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();


        Random aleatorio = new Random(System.currentTimeMillis());
        // Producir nuevo int aleatorio entre 0 y 99
        int secreto = aleatorio.nextInt(100);

       if (num == -1) {
           System.out.println("Te has rendido");

       } else {
           do {
               if (num < secreto) {
                   System.out.println("El numero secreto es mas grande");
                   System.out.println("Ingrese otro numero");
                   num = sc.nextInt();
               } else if (num > secreto) {
                   System.out.println("El numero secreto es mas pequeño");
                   System.out.println("Ingrese otro numero");
                   num = sc.nextInt();
               }
           }while (num != secreto);

       }

       if (num == secreto) {
            System.out.println("Has ganado");
        }
    }
}
