import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double numero;

        System.out.println("Ingresa números positivos uno por uno (ingresa un número negativo para terminar):");

        while (true) {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextDouble();
            // Si el número ingresado es negativo, se rompe el ciclo
            if (numero < 0) {
                break;
            }
            suma += numero;
            contador++;
        }

        // Verificar si se ingresó al menos un número positivo
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}
