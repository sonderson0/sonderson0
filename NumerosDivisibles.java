public class NumerosDivisibles {
    public static void main(String[] args) {
        System.out.println("Números divisibles por 3 y 5 entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            // Se comprueba si el número es divisible por 3 y por 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
