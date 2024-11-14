package main.Primeros_pasos;
import java.util.Scanner;

public class Ej36 {
    public static void main(String[] args) {
        int numUsuario;
        String binario = "";
        int resto;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de usuario: ");
        numUsuario = entrada.nextInt();

        do {
            resto = numUsuario % 2;
            numUsuario = numUsuario / 2;
            binario = resto + binario;

        }while(numUsuario > 0);

        System.out.print("El binario es: " + binario);
    }
}
