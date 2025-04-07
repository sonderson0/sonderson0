import java.util.Scanner;

public class VerificarEdadParaVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar la edad al usuario
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            // Verificar si la edad es válida
            if (edad < 0) {
                System.out.println("Error: La edad no puede ser negativa.");
            } else {
                // Determinar la elegibilidad para votar
                if (edad >= 18) {
                    System.out.println("Usted es elegible para votar.");
                } else {
                    System.out.println("Usted no es elegible para votar.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: Por favor, ingrese un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
