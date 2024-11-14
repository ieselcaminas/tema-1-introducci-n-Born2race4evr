package main.Nuevos_Ejercicios;

import java.util.Scanner;

public class Precio_Real {

    public static double precioReal(double precio_real, double precio_rebajado, double descuento) {

        descuento = (precio_real - precio_rebajado) / precio_real * 100;
        return descuento;

    }

    public static void main(String argv[]) {
        double precio_real;
        double precio_rebajado;
        double descuento = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio real: ");
        precio_real = entrada.nextDouble();
        System.out.println("Ingrese el precio rebajado: ");
        precio_rebajado = entrada.nextDouble();

        double total = precioReal(precio_real, precio_rebajado, descuento);

        System.out.println("El descuento es del: " + total + "%");

    }

}
