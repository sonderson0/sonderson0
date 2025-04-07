import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar el precio original al usuario
            System.out.print("Ingrese el precio original del producto: ");
            double precioOriginal = scanner.nextDouble();

            // Verificar que el precio sea válido
            if (precioOriginal < 0) {
                System.out.println("Error: El precio no puede ser negativo.");
                return;
            }

            // Determinar el porcentaje de descuento
            double porcentajeDescuento;
            if (precioOriginal <= 100) {
                porcentajeDescuento = 0;
            } else if (precioOriginal <= 200) {
                porcentajeDescuento = 10;
            } else if (precioOriginal <= 500) {
                porcentajeDescuento = 20;
            } else {
                porcentajeDescuento = 25;
            }

            // Calcular el monto del descuento y el precio final
            double montoDescuento = (precioOriginal * porcentajeDescuento) / 100;
            double precioFinal = precioOriginal - montoDescuento;

            // Mostrar los resultados
            System.out.printf("Precio original: $%.2f%n", precioOriginal);
            System.out.printf("Porcentaje de descuento aplicado: %.0f%%%n", porcentajeDescuento);
            System.out.printf("Monto del descuento: $%.2f%n", montoDescuento);
            System.out.printf("Precio final después del descuento: $%.2f%n", precioFinal);

        } catch (Exception e) {
            System.out.println("Error: Por favor, ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }}
    