import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        // Leer 5 números enteros
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // Acumular la suma
        }

        // Mostrar la suma
        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}
