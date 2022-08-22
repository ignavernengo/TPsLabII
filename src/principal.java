import javax.swing.*;

public class principal {

    public static void main (String [] args) {

        String nombre;
        int edad;
        float salario;
        boolean carnet;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        salario = Float.parseFloat(JOptionPane.showInputDialog("¿Cuánto quisiera ganar? "));
        carnet = true;

        JOptionPane.showMessageDialog(null, "Su nombre es: " +nombre);
        JOptionPane.showMessageDialog(null, "Su edad es: " +edad);
        JOptionPane.showMessageDialog(null, "Su salario pretendido es: " +salario);
        JOptionPane.showMessageDialog(null, "¿Tiene licencia de conducir? " +carnet);
    }
}
