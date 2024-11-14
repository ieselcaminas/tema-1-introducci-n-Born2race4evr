package main.Nuevos_Ejercicios;

import java.util.Scanner;

public class Divisores {

    public static String numeroNatural(int num){
        String resultado = "";
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                resultado += i + " ";
            }
        }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero");
        int num = sc.nextInt();

        String resultado = numeroNatural(num);
        System.out.println(resultado);

    }
}
