/*calcular el IMC */
 

import java.util.Scanner;

public class InnerIMC {

    





public static void main(String[] args) {
    
    Scanner teclado= new Scanner(System.in);
    
    //Variables

    double peso;
    double estatura;
    double IMC;


    //Entradas


    System.out.println("cual es su peso en kilogramos");
    peso = teclado.nextDouble();
    System.out.println("cual es su estatura en metros");
    estatura = teclado.nextDouble();


    //Calculo

    IMC = peso/(estatura*estatura);
    System.out.println("El IMC es :" + IMC);
    
    //Situacion IMC por persona
    if (IMC < 18.5){
        System.out.println("Bajo peso ");
    }else if (IMC >=18.5 && IMC <= 24.9){
        System.out.println(" peso normal ");
    }else if (IMC >=25 && IMC <= 29.9){
        System.out.println("sobrepeso");
    }else{
        System.out.println("obesidad");
    
    }
    }
}
