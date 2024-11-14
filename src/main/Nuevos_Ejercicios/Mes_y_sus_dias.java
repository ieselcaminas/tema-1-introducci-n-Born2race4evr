package main.Nuevos_Ejercicios;

import java.util.Scanner;

public class Mes_y_sus_dias {

    public static String meses(int mes){
        switch (mes){
            case 1:
                return ("Tiene 31 días");
            case 2:
                return ("Tiene 28 días");
            case 3:
                return ("Tiene 31 días");
            case 4:
                return ("Tiene 30 días");
            case 5:
                return ("Tiene 31 días");
            case 6:
                return ("Tiene 30 días");
            case 7:
                return ("Tiene 31 días");
            case 8:
                return ("Tiene 31 días");
            case 9:
                return ("Tiene 30 días");
            case 10:
                return ("Tiene 31 días");
            case 11:
                return ("Tiene 30 días");
            case 12:
                return ("Tiene 31 días");
        }

        return "";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();

        String numerodias = meses(mes);
        System.out.println(numerodias);

    }
}
