/*calcular el promedio de 3 calificaciones */
 import java.util.Scanner;
 public class promedio {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Float a,b,c,promedio;
    System.out.println("ingresa 3 calificaciones: ");
    a = input.nextFloat();
    b = input.nextFloat();
    c = input.nextFloat();
    promedio = (a+b+c)/3;
    System.out.println("El promedio de las 3 calificaciones es: "+promedio);
    input.close();


    }
 }

 
