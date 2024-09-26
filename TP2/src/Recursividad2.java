
import java.util.Scanner;

public class Recursividad2 {
    public static int recursi(int x) {
        if (x == 0) {
            return x = 0;
        } else {
            return (x % 10) + recursi(x / 10);
        }
    }

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = numero.nextInt();
        int resultado = recursi(num);
        System.out.println("la suma de los numeros es de " + resultado);
    }
}

