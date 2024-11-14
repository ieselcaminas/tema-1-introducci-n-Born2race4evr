import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        int num;
        int positivo = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            num = sc.nextInt();
            if (num > 0) {
                positivo ++;
            }

        }
        System.out.println("Positivos: " + positivo);

    }
}
