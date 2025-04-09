import java.util.Scanner;

public class ContarLetrasAA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        int contador = 0;
        // Convertir la palabra a minúsculas para hacer la búsqueda insensible a mayúsculas/minúsculas
        String palabraLower = palabra.toLowerCase();

        // Recorrer cada carácter de la palabra
        for (int i = 0; i < palabraLower.length(); i++) {
            if (palabraLower.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra \"" + palabra + "\".");

        scanner.close();
    }
}
