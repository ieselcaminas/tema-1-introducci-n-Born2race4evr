package main.Nuevos_Ejercicios;

public class EsPositivoMain {
    public static boolean esPositivo(int a){
        if (a >= 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String argv[]) {
        int numero = Utilidades.leerEntero("Introduce un número entero:");

        //Si las condiciones son mutualmente excluyentes, se usa if .. else
        if (esPositivo(numero)){
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }


    }
}
