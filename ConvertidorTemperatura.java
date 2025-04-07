import java.util.Scanner;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Mostrar el menú de opciones
        System.out.println("Seleccione la unidad a la que desea convertir:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Ingrese su elección (1 o 2): ");
        int opcion = scanner.nextInt();

        // Realizar la conversión basada en la elección del usuario
        switch (opcion) {
            case 1:
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("La temperatura en Fahrenheit es: %.2f°F%n", fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin es: %.2fK%n", kelvin);
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }

        scanner.close();
    }
}
