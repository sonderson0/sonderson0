/*calcular el area de un rectangulo */

import java.util.Scanner;

-public class arearectangulo {
-public static void main(String[] args) {
-Scanner input = new Scanner(System.in);
-float area,base,altura;
-System.out.println("Ingresa la base del rectangulo");
-base = input.nextFloat();
-System.out.println("Ingresa la altura");
-altura = input.nextFloat();
-area = base * altura;
-System.out.println("El area del rectangulo es: "+area+" cm2");
-input.close();
