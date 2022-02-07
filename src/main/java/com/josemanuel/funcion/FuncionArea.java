package com.josemanuel.funcion;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;

public class FuncionArea implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner sc) {
        //mostramos la funcion del area;
        System.out.println(" P * A / 2");
        
        System.out.println("Introduzca (P)erímetro:");
        String pStr = sc.next();//pedimos introducción de datos por el usuario;
        BigDecimal pBD = new BigDecimal(pStr);

        System.out.println("Introduzca (A)potema:");
        String aStr = sc.next();// pedimos introducción de datos;
        BigDecimal aBD = new BigDecimal(aStr);

        System.out.println("Resultado" + pBD.multiply(aBD).divide(BigDecimal.valueOf(2)).toString());
       //Se muestra el resultado de la operacion;
        return null;
    }

    
}
