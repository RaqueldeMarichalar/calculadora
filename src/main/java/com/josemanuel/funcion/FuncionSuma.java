package com.josemanuel.funcion;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;

public class FuncionSuma implements Function<Scanner, Void>{ //la función incluye un scanner y un void

    @Override
    public Void apply(Scanner sc) {
        
        System.out.println("\nOperación seleccionada suma:\n");// mostramos lo que hace esta elección
        System.out.println("A + B\n");
        
        System.out.println("Introduzca A:");
        String aStr = sc.next();//pedimos entrada de datos y los recogemos con el Scanner
        BigDecimal aBD = new BigDecimal(aStr);

        System.out.println("Introduzca B:");
        String bStr = sc.next();
        BigDecimal bBD = new BigDecimal(bStr);

        System.out.println("\nResultado: " + aBD.add(bBD).toString() + "\n");
        //mostramos el resultado de la operacion

        return null;
    }

}
