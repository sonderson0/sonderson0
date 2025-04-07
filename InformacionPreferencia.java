import java.util.Scanner;

public class InformacionPreferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su preferencia
        System.out.println("Ingrese el nombre de un artista, película, serie o algo de su preferencia:");
        String preferencia = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para comparación

        // Proporcionar información basada en la preferencia utilizando switch
        switch (preferencia) {
            case "coldplay":
                System.out.println("Coldplay es una banda británica de pop rock formada en Londres en 1996.");
                break;
            case "inception":
                System.out.println("Inception es una película de ciencia ficción dirigida por Christopher Nolan y estrenada en 2010.");
                break;
            case "breaking bad":
                System.out.println("Breaking Bad es una serie de televisión estadounidense creada por Vince Gilligan que se emitió de 2008 a 2013.");
                break;
            case "frida kahlo":
                System.out.println("Frida Kahlo fue una pintora mexicana conocida por sus autorretratos y obras inspiradas en la naturaleza y artefactos de México.");
                break;
            case "the beatles":
                System.out.println("The Beatles fue una banda de rock inglesa formada en Liverpool en 1960, considerada una de las más influyentes de la historia.");
                break;
            default:
                System.out.println("Lo siento, no tengo información sobre " + preferencia + ".");
        }

        scanner.close();
    }
}