import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100.
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        // Crear un objeto Scanner para leer la entrada 
        Scanner scanner = new Scanner(System.in);
        int intento;

        System.out.println("¡Bienvenido al juego de Adivinar el Número!");
        System.out.println("Adivina el número que estoy pensando (entre 1 y 100):");

        // Ciclo que continua hasta que se acierte el número.
        do {
            System.out.print("Ingresa tu suposición: ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }
        } while (intento != numeroSecreto);

        scanner.close();
    }
}
