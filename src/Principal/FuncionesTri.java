package Principal;

public class FuncionesTri {
    public static void main(String[] args) {

    // FUNCIONES TRIGONOMETRICAS

    double angulo = 45;
    double convertirRadianes = Math.toRadians(angulo);

        System.out.println("Grados: " +angulo + "\nRadianes: " +convertirRadianes);

    // SIN - FUNCION SENO

    double seno = Math.sin(convertirRadianes);
        System.out.println("Seno de: " + angulo + " = " + seno);

    // COS - FUNCION COSENO

    double coseno = Math.cos(convertirRadianes);
        System.out.println("Coseno de: " + angulo + " = " + coseno);

    // TAN - FUNCION TANGENTE

        double tangente = Math.tan(convertirRadianes);
        System.out.println("Tangente de: " + angulo + " = " + tangente);

    // ATAN - FUNCION ARCOTANGENTE

    double arcoTangente = Math.atan(tangente);
    double convertirArcoTangente = Math.toDegrees(arcoTangente);

        System.out.println("ArcoTangente de: " + tangente + " = " + convertirArcoTangente);

    // ATAN2 - ARCOTANGENTE DE DOS PARAMETROS

    double x = 15;
    double y = 90;

    double theta = Math.atan2(x,y);

        System.out.println("Arcotangente de dos parametros: " +theta);
    }
}
