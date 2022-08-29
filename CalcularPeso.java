package TP9;
import java.util.Scanner;

public class CalcularPeso {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int altura;
    int pesoIdeal = 0;
    String genero = "";

    while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false) {

            System.out.println("Ingrese H si es hombre, o M si es mujer: ");
            genero = entrada.nextLine();

        if (genero.equalsIgnoreCase("h") == true) {
            System.out.println("Usted es hombre. Ingrese su altura en cm: ");

            altura = entrada.nextInt();
            pesoIdeal = altura - 110;

        }

        else if (genero.equalsIgnoreCase("m")) {
            System.out.println("Usted es mujer. Ingrese su altura en cm: ");

            altura = entrada.nextInt();
            pesoIdeal = altura - 120;

        }
    }

        System.out.println("Su peso ideal es: " +pesoIdeal +" kg");

    }
}
