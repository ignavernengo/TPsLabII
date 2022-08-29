package TP10;

import javax.swing.*;

public class AdivinarNumero {
    public static void main(String[] args) {

    int numero, contador = 0;
    int aleatorio;

    aleatorio = (int) (Math.random() *100);

    do {

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (aleatorio > numero) {
            System.out.println("Ingrese un numero mayor: ");

        }
        else {
            System.out.println("Ingrese un numero menor: ");

        }

        contador ++;

    } while (numero != aleatorio);

        System.out.println("¡Correcto! El numero es "+numero+". Lo adivinaste " +contador+ " intentos");
    }
}
