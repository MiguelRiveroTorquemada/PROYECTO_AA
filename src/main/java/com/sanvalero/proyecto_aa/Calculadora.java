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
    
    public void ejecutar() {
        
        System.out.print("Elige una operacion : \n");
        System.out.print("1.SUMA \n");
        System.out.print("2.RESTA \n");
        System.out.print("3.MULTIPLICACION \n");
        System.out.print("4.DIVISION \n");
        
        String operacion = entrada.next();
    }
}