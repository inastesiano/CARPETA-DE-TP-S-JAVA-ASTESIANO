import javax.swing.*;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Ejercicios {
    public static void ej1() {
        Scanner decima = new Scanner(System.in);
        System.out.println("ingrese un numero en decimal");
        double deci = decima.nextDouble();
        short peque = (short) deci;
        int entero = (int) deci;
        long largo = (long) deci;
        String texto = String.valueOf(deci);
        float flotante = (float) deci;
        System.out.println("el numero en pequeño es " + peque);
        System.out.println("el numero en entero es " + entero);
        System.out.println("el numero en largo es " + largo);
        System.out.println("el numero en texto es " + texto);
        System.out.println("el numero en flotante es " + flotante);
    }

    public static void ej2() {
        byte num = (byte) 140;
        System.out.println("Número: " + num);
        if (Byte.MIN_VALUE < num && num < Byte.MAX_VALUE) {
            System.out.println("El número está dentro de los límites (" + num + ")");
        } else {
            System.out.println("El número NO está dentro de los límites " + num);
            System.out.println("para que el codigo funcion ponga una variable mas grande(long,int) ");
            long num2 = (long) num;
        }
    }

    public static void ej3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();

        if (num > 99 && num < 999) {
            System.out.println("el numero esta dentro del rango");
            int num1 = num % 10;
            int num2 = (num / 10) % 10;
            int num3 = num / 100;
            int num5 = num1 + num2 + num3;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println("la suma de todos los digitos es de " + num5);

        } else {
            System.out.println("el numero no esta dentro del rango");
        }
    }

    public static void ej5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = scanner.nextInt();
        String num1 = String.valueOf(num);
        System.out.println("el numero ingresado ahora es un string " + num1);
        if (num1 instanceof String) {
            System.out.println("la variable es de tipo String");
        }
    }

    public static void ej6() {
        String cadena = "La lluvia en Mendoza es escasa";
        System.out.println("la longitud o caracter de la cadena es de " + cadena.length());
    }

    /*public static void ej7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese una cadena");
        String cadena= scanner.nextLine();
        int cont=0;
        int longitud= cadena.length();
        for(int num=0; num < longitud; num++ ){
            char cadena1= cadena.charAt(num);
            if(ej9(cadena1)){
                cont=cont+1;
            }
        }
        System.out.println("la longitud de la cadena es de "+longitud);
        System.out.println("la cantidad de vocales son de " + cont);
    }*/

    public static void ej8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese una cadena");
        String cadena = scanner.nextLine();
        String cadena2 = cadena.replace("a", "e");
        System.out.println("la cadena modificada queda haci " + cadena2);
    }

    public static void ej9() {
        String cadena = "La lluvia en Mendoza es escasa";
        int cadena1 = cadena.length();
        System.out.println(cadena);
        for (int num = 0; num < cadena1; num++) {
            char cade = cadena.charAt(num);
            int codigo = (int) cade;
            System.out.print(codigo + " ");
        }
    }

    public static void ej10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String cadena = scanner.nextLine();
        String min = cadena.toLowerCase();
        String may = cadena.toUpperCase();
        System.out.println("1)Convertir frase en minuscula ---- 2)Convertir frase en mayuscula ");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("la frase en minuscula : " + min);
        } else {
            System.out.println("la frase en minuscula : " + may);
        }
    }

    public static void ej11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String cadena = scanner.nextLine();
        System.out.println("Ingrese una frase: ");
        String cadena2 = scanner.nextLine();
        if (cadena.equals(cadena2)) {
            System.out.println("las 2 frases son iguales.");
        } else {
            System.out.println("las 2 frases son distintas.");
        }
    }

    public static void ej12() {
        String cadena = "holamundo";
        String cadena2 = cadena.substring(3, 5);
        System.out.println("las letras en la pocision 4 y 5 son " + cadena2);
    }

    public static void ej13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase a buscar: ");
        String cadena = scanner.nextLine();
        System.out.println("Ingrese una frase en la que se va a buscar: ");
        String cadena2 = scanner.nextLine();
        if (cadena2.contains(cadena)) {
            System.out.println("La primera frase se encuentra dentro de la segunda frase.");
        } else {
            System.out.println("La primera frase no se encuentra dentro de la segunda frase.");
        }
    }

    public static void ej14() {
        JOptionPane.showMessageDialog(null, "Ejercicio 14:\n Los tipos de datos primitivos acceden al valor asociado directo y los datos por referencia almacenan la dirección de memoria.");
    }

    public static void pruebaArreglos() {

        int notas[] = new int[10];
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese nota " + (i + 1) + ": ");
            notas[i] = teclado.nextInt();

            System.out.println("NOTA " + (i + 1) + ": " + notas[i]);
        }


        int sumaNotas = 0;
        for (int i = 0; i < 10; i++) {
            sumaNotas += notas[i];
        }

        float promedioNotas = 0;
        promedioNotas = (sumaNotas / 10);

        System.out.println("El promedio obtenido es de: " + promedioNotas);

    }

    public static void practicaArrayDoble() {
        String arreglo[][] = new String[3][2];
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int col = 0; col < arreglo[fila].length; col++) {
                System.out.println("Fila: " + fila + " / Columna: " + col);
            }
        }
    }
}