
import java.util.Scanner;

public class Recursividad3 {
    public static String hola(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return (cadena.substring(1)) + cadena.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);
        String cade = cadena.nextLine();
        String caden = hola(cade);
        System.out.println("la cadena sin invertir " + cade);
        System.out.println("la cadena invertida es " + caden);
    }
}
