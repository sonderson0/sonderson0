import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingresa una letra (o un espacio para terminar): ");
            // Leer la entrada completa para permitir capturar incluso espacios
            String input = scanner.nextLine();

            // Termina el programa si el usuario ingresa exactamente un espacio.
            if (input.equals(" ")) {
                break;
            }

            // Si no se ingresa nada, se vuelve a solicitar una entrada.
            if (input.isEmpty()) {
                continue;
            }
            
            // Tomamos el primer carácter de la entrada.
            char letra = input.charAt(0);

            // Verificar que el carácter sea una letra
            if (!Character.isLetter(letra)) {
                System.out.println("El carácter ingresado no es una letra.");
                continue;
            }
            
            // Convertir la letra a minúscula para una comparación insensible a mayúsculas
            letra = Character.toLowerCase(letra);

            // Verificar si la letra es una vocal o una consonante
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra '" + letra + "' es una vocal.");
            } else {
                System.out.println("La letra '" + letra + "' es una consonante.");
            }
        }
        
        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
