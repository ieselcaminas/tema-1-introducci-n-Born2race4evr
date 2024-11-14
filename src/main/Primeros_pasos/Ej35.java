package main.Primeros_pasos;
import java.util.Scanner;

public class Ej35 {
    public static void main(String[] args) {
        int num;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el divisor");
        num = sc.nextInt();
        System.out.println("Ingrese el dividendo");
        num2 = sc.nextInt();

       do {
           num = num - num2;
       } while (num >= num2);
        System.out.println("El resultado es = " + num);

    }
}
