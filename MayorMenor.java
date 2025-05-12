import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        // Leer 8 números enteros
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar mayor y menor con el primer número
        int mayor = numeros[0];
        int menor = numeros[0];

        // Comparar para encontrar el mayor y el menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        scanner.close();
    }
}

