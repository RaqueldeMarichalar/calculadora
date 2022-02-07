package com.josemanuel.funcion;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;



public class FuncionResta implements Function<Scanner, Void>{
    //La función resta implementa la función Scanner y void. 

    @Override
    public Void apply(Scanner sc) {
        
        System.out.println("\nOperación seleccionada resta:\n");
        //Lanzamos mensaje de operacion seleccionada
        System.out.println("A - B\n");
        
        System.out.println("Introduzca A:");//pedimos datos por teclado
        String aStr = sc.next();//El Scanner lee los datos
        BigDecimal aBD = new BigDecimal(aStr);//Con esta clase podemos representar numeros de manera precisa

        System.out.println("Introduzca B:");
        String bStr = sc.next();
        BigDecimal bBD = new BigDecimal(bStr);

        System.out.println("\nResultado: " + aBD.subtract(bBD).toString() + "\n");
        // mostramos el resultado por pantalla añadiéndole la información del método toString

        return null;
    }

}
