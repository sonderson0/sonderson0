import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Debes ingresar un número entero positivo.");
        } else {
            int i = 1;
            System.out.println("Números impares desde 1 hasta " + numero + ":");
            do {
                // Si el número es impar, se imprime
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= numero);
        }
        
        scanner.close();
    }
}
