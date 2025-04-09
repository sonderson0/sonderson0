import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcionContinuar;

        do {
            // Mostrar el menú de opciones
            System.out.println("=== Calculadora Básica ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Selecciona una opción (1-4): ");
            int opcion = scanner.nextInt();

            // Solicitar los números para la operación
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            // Realizar la operación seleccionada
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("La suma es: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("La resta es: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("La multiplicación es: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("La división es: " + resultado);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción del 1 al 4.");
                    operacionValida = false;
                    break;
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Deseas realizar otra operación? (S/N): ");
            opcionContinuar = scanner.next().charAt(0);
            System.out.println();

        } while (Character.toUpperCase(opcionContinuar) == 'S');

        System.out.println("¡Gracias por usar la Calculadora Básica!");
        scanner.close();
    }
}
