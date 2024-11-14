package main.Nuevos_Ejercicios;

public class Valor_nota_main {
    public static String valorenLetra(int nota) {

        if ((nota < 0) || (nota > 10)) {
            return ("Nota inválida");
        }else if (nota < 3) {
            return ("Muy deficiente");
        }else if (nota < 5 ) {
            // No hace falta que comprobemos que es mayor que 3, porque si lo fuera
            // habría entrado por el if (nota < 3) {
            return ("Insuficiente");
        }else if (nota < 6 ) {
            return ("Suficiente");
        }else if (nota < 7 ) {
            return ("bien");
        }else if (nota < 9 ) {
            return ("Notable");
        }else {
            return ("Sobresaliente");
        }
    }

    public static void main(String argv[]) {
        int nota = Utilidades.leerEntero("Introduce el valor de la nota entera:");
        String resultado = valorenLetra(nota);
        System.out.println(resultado);

    }
}
