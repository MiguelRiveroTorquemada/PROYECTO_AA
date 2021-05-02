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
        
        switch (operacion){
            case "1":
                hacerSuma();
                break;
               
            case "2":
                hacerResta();
                break;
                
            case "3":
                hacerMultiplicacion();
                break;
                
            case "4":
                hacerDivision();
                break;
                
            default:
                System.out.println("OPCION ERRONEA");
                break;
        }
    }
    
    private void hacerMultiplicacion(){
        int resultado = num1*num2;
        System.out.println("El resultado es: " + resultado);
    }
}