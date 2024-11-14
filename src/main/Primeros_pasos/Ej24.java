package main.Primeros_pasos;
import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        float nota;
        float cuantasNotas = 0;
        float sumaNotas = 0;
        float media;
        boolean hayDiez = false;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduzca la nota: ");
            nota = entrada.nextFloat();
            if (nota >= 0 && nota <= 10) {
                cuantasNotas ++;
                sumaNotas = sumaNotas + nota;
                if (nota == 10) {
                    hayDiez = true;
                }
            }
        }while (nota != (-1));

        if (hayDiez == true) {
            System.out.println("Hay un 10 ");
        }

        media = sumaNotas / cuantasNotas;
        System.out.println("La media es: " + media);
        }
    }

