import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        // Leer 10 números enteros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar pares e impares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

        scanner.close();
    }
}
