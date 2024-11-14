package main.Primeros_pasos;
import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        int num;
        int multiplicacion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            multiplicacion = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacion);
        }
    }
}
