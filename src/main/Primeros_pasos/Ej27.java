package main.Primeros_pasos;
import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        int num;
        String res = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            res += i + " ";
            System.out.println(res);
        }
    }
}
