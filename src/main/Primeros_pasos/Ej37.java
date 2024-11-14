package main.Primeros_pasos;
import java.util.Scanner;

public class Ej37 {
    public static void main(String[] args) {
        String binario = "";
        double num = 0;
        char acumulador = 0;
        double resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del binario: ");
        binario = sc.nextLine();

        for (int i = binario.length() - 1; i >=0; i--) {

            acumulador = binario.charAt(binario.length()-1 - i);
            
            if (acumulador == '1') {
                num = Math.pow(2, i);
                resultado = num + resultado;
            }
        }
        System.out.println(resultado);


    }
}
