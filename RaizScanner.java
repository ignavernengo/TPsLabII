package TP8;
import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

        double numero;
        double raiz;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();

        raiz = Math.sqrt(numero);

        System.out.println("La raiz de " +numero+ " es: " +raiz);

    }
}
