import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir al usuario el tamaño del arreglo
        System.out.print("¿Cuántos elementos deseas ingresar? ");
        int n = scanner.nextInt();

        // Crear el arreglo con el tamaño indicado
        int[] array = new int[n];

        // 2. Leer los números desde teclado
        System.out.println("Ingresa " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // 3. Ordenamiento burbuja en orden ascendente
        bubbleSort(array);

        // 4. Mostrar el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    /**
     * Método que implementa el ordenamiento burbuja para un arreglo de enteros.
     * Recorre varias veces el arreglo, comparando elementos adyacentes
     * y permutándolos si están en el orden incorrecto.
     *
     * @param arr El arreglo de enteros a ordenar
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        // Repetimos hasta que no haya intercambios en una pasada completa
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Intercambiar arr[i] y arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            // Tras cada pasada, el último elemento queda en su posición final,
            // así que podemos reducir el rango a revisar en la siguiente iteración
            n--;
        } while (swapped);
    }
}
