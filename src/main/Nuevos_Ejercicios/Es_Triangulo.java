package main.Nuevos_Ejercicios;

import java.util.Scanner;

public class Es_Triangulo {
    public static boolean palicos(int palo1, int palo2, int palo3) {
        if (palo1 > palo2 + palo3 || palo2 > palo1 + palo3 || palo3 > palo2 + palo1) {
            return false;
        } else {
            return true;
        }

    }
    public static void main(String[] args) {
        int palo1;
        int palo2;
        int palo3;

        palo1 = Utilidades.leerEntero("Ingrese el primer palo: ");
        palo2 = Utilidades.leerEntero("Ingrese el segundo palo: ");
        palo3 = Utilidades.leerEntero("Ingrese el tercer palo: ");

        if (palicos(palo1, palo2, palo3)) {
            System.out.println("El triangulo se puede hacer");
        } else {
            System.out.println("El triangulo no se puede hacer");
        }

    }
}
