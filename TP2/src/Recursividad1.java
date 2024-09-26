
import java.util.Scanner;

public class Recursividad1 {
    public static int recusi(int x) {
        if (x > 0) {
            return x + recusi(x - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero mayor a 0");
        int num = numero.nextInt();

        if (num > 0) {
            int resul = recusi(num);
            System.out.print("la sumatoria de los numero es de " + resul);
        }
    }
}
