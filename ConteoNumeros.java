import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de números a ingresar
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidadNumeros = scanner.nextInt();

        // Inicializar contadores
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        // Leer los números y actualizar contadores
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Números mayores que 0: " + contadorPositivos);
        System.out.println("Números menores que 0: " + contadorNegativos);
        System.out.println("Números iguales a 0: " + contadorCeros);

        scanner.close();
    }
}
