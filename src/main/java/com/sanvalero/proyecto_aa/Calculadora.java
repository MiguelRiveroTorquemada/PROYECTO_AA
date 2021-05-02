package com.sanvalero.proyecto_aa;

import java.util.Scanner;

public class Calculadora {

    private final int num1;
    private final int num2;
    
    Scanner entrada = new Scanner(System.in);
    
    public Calculadora(){
        System.out.println("Introduce un numero: ");
        this.num1 = entrada.nextInt();
        System.out.println("Introduce otro numero: ");
        this.num2 = entrada.nextInt();
        Scanner entrada = new Scanner(System.in);
    }
       
    private void hacerSuma(){
        int resultado = num1+num2;
        System.out.println("El resultado es: " + resultado);
    }
    
    private void hacerResta(){
        int resultado = num1-num2;
        System.out.println("El resultado es: " + resultado);
    }
	
	 private void hacerMultiplicacion(){
        int resultado = num1*num2;
        System.out.println("El resultado es: " + resultado);
    }
    
    private void hacerDivision(){
        int resultado = num1/num2;
        System.out.println("El resultado es: " + resultado);
    }
}