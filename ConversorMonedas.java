import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en pesos mexicanos
        System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
        double cantidadMXN = scanner.nextDouble();

        // Mostrar el menú de opciones
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Dólar estadounidense (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Baht tailandés (THB)");
        System.out.println("4. Yen japonés (JPY)");
        System.out.println("5. Won surcoreano (KRW)");
        System.out.println("6. Dólar australiano (AUD)");
        System.out.println("7. Sol peruano (PEN)");
        System.out.println("8. Dólar canadiense (CAD)");
        System.out.println("9. Bolívar venezolano (VES)");
        System.out.println("10. Peso argentino (ARS)");
        System.out.print("Ingrese el número de su elección: ");
        int opcion = scanner.nextInt();

        // Tasas de cambio actuales (al 6 de abril de 2025)
        // Fuente: https://www.x-rates.com/table/?amount=1&from=MXN
        double tasaUSD = 0.048954;
        double tasaEUR = 0.044825;
        double tasaTHB = 1.680580;
        double tasaJPY = 7.148148;
        double tasaKRW = 71.423804;
        double tasaAUD = 0.081326;
        double tasaPEN = 0.183578; // Aproximado, ya que no se encontró en la fuente
        double tasaCAD = 0.069755;
        double tasaVES = 0.000048; // Aproximado, ya que no se encontró en la fuente
        double tasaARS = 52.799942;

        double cantidadConvertida = 0;
        String moneda = "";

        // Realizar la conversión basada en la elección del usuario
        switch (opcion) {
            case 1:
                cantidadConvertida = cantidadMXN * tasaUSD;
                moneda = "USD";
                break;
            case 2:
                cantidadConvertida = cantidadMXN * tasaEUR;
                moneda = "EUR";
                break;
            case 3:
                cantidadConvertida = cantidadMXN * tasaTHB;
                moneda = "THB";
                break;
            case 4:
                cantidadConvertida = cantidadMXN * tasaJPY;
                moneda = "JPY";
                break;
            case 5:
                cantidadConvertida = cantidadMXN * tasaKRW;
                moneda = "KRW";
                break;
            case 6:
                cantidadConvertida = cantidadMXN * tasaAUD;
                moneda = "AUD";
                break;
            case 7:
                cantidadConvertida = cantidadMXN * tasaPEN;
                moneda = "PEN";
                break;
            case 8:
                cantidadConvertida = cantidadMXN * tasaCAD;
                moneda = "CAD";
                break;
            case 9:
                cantidadConvertida = cantidadMXN * tasaVES;
                moneda = "VES";
                break;
            case 10:
                cantidadConvertida = cantidadMXN * tasaARS;
                moneda = "ARS";
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 10.");
                scanner.close();
                return;
        }

        // Mostrar el resultado de la conversión
        System.out.printf("La cantidad de %.2f MXN equivale a %.2f %s%n", cantidadMXN, cantidadConvertida, moneda);

        scanner.close();
    }
}
