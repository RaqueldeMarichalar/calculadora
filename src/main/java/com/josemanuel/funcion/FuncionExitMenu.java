package com.josemanuel.funcion;

import java.util.Scanner;
import java.util.function.Function;

import com.josemanuel.menu.ExitMenuException;

public class FuncionExitMenu implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner t) {
        // lanzamos una excepción propia que nos permita salir del menú;
        throw new ExitMenuException();

        //return null;
    }
    
}
