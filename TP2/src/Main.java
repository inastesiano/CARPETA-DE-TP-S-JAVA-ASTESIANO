import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selector;
        String seleccion;

        Scanner scanner = new Scanner(System.in);
        seleccion = JOptionPane.showInputDialog(null, "Ingrese el n° de ejercicio:");
        selector = Integer.parseInt(seleccion);

        Ejercicios obj=new Ejercicios(); //Creamos un objeto de la clase Ejercicios

        if (selector < 1 || selector > 17) {
            System.out.println("Ingresó un nro incorrecto. Saliendo...");
        } else {
            switch (selector) {
                case 1:
                    Ejercicios.ej1();//Si se elige la opción 1, el programa llama a la funcion ej1 de la clase Ejercicios
                    break;

                case 2:
                    Ejercicios.ej2();
                    break;

                case 3:
                    Ejercicios.ej3();
                    break;

                case 4:
                    break;

                case 5:
                    Ejercicios.ej5();
                    break;

                case 6:
                    Ejercicios.ej6();
                    break;

                case 7:

                    break;

                case 8:
                    Ejercicios.ej8();
                    break;

                case 9:
                    Ejercicios.ej9();
                    break;

                case 10:
                    Ejercicios.ej10();
                    break;

                case 11:
                    Ejercicios.ej11();
                    break;

                case 12:
                    Ejercicios.ej12();
                    break;

                case 13:
                    Ejercicios.ej13();
                    break;

                case 14:
                    Ejercicios.ej14();
                    break;

                case 15:
                    Ejercicios.ej15();
                    break;

                case 16:
                    Ejercicios.ej16();
            }
        }
    }

}
