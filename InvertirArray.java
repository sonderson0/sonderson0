import java.util.Scanner;

public class InvertirArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        // Leer 6 números enteros
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el array invertido
        System.out.println("Array invertido:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
