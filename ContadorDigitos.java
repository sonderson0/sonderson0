import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        // Usamos Math.abs para trabajar siempre con el valor absoluto
        numero = Math.abs(numero);
        
        int contador = 0;
        
        // Si el número ingresado es 0, se cuenta como un dígito
        if (numero == 0) {
            contador = 1;
        } else {
            // Dividir el número entre 10 sucesivamente para contar sus dígitos
            while (numero > 0) {
                numero /= 10;
                contador++;
            }
        }
        
        System.out.println("El número ingresado tiene " + contador + " dígitos.");
        scanner.close();
    }
}
