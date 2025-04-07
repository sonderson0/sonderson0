import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar las calificaciones al usuario
            System.out.print("Ingrese la calificación de los parciales (0-100): ");
            double calificacionParciales = scanner.nextDouble();

            System.out.print("Ingrese la calificación del proyecto (0-100): ");
            double calificacionProyecto = scanner.nextDouble();

            System.out.print("Ingrese la calificación del examen final (0-100): ");
            double calificacionExamenFinal = scanner.nextDouble();

            // Verificar que las calificaciones estén en el rango de 0 a 100
            if (!esCalificacionValida(calificacionParciales) ||
                !esCalificacionValida(calificacionProyecto) ||
                !esCalificacionValida(calificacionExamenFinal)) {
                System.out.println("Error: Todas las calificaciones deben estar entre 0 y 100.");
                return;
            }

            // Calcular la calificación final aplicando los pesos
            double calificacionFinal = (calificacionParciales * 0.4) +
                                       (calificacionProyecto * 0.3) +
                                       (calificacionExamenFinal * 0.3);

            // Mostrar la calificación final
            System.out.printf("La calificación final es: %.2f%n", calificacionFinal);

        } catch (Exception e) {
            System.out.println("Error: Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }

    private static boolean esCalificacionValida(double calificacion) {
        return calificacion >= 0 && calificacion <= 100;
    }
}
