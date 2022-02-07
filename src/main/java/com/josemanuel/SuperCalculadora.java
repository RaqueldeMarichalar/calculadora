package com.josemanuel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.josemanuel.funcion.FuncionArea;
import com.josemanuel.funcion.FuncionExitMenu;
import com.josemanuel.funcion.FuncionResta;
import com.josemanuel.funcion.FuncionSuma;
import com.josemanuel.menu.ExitMenuException;
import com.josemanuel.menu.ItemMenu;
import com.josemanuel.menu.Menu;

public class SuperCalculadora 
{

    public SuperCalculadora() {
        sc = new Scanner(System.in);
        this.inicializaMenus();
    }

    private Scanner sc;
    private Menu menuPrincipal;

    public static void main( String[] args ) 
    // Creamos una supercalculadora la clase se crea tras el metodo main.
    {
        SuperCalculadora superCalculadora = new SuperCalculadora();
        
        try {
            superCalculadora.getMenuPrincipal().bucle();
        } catch(ExitMenuException eme) {
            System.out.println("FIN SUPERCALCULADORA");
            superCalculadora.getSc().close();
        }

    }
 // Con este método inicializamos el menú.
    private void inicializaMenus() {
        
        String introOpc = "Introduzca opción:";
        ItemMenu itemMenuExit = new ItemMenu("Salir", new FuncionExitMenu());
        //Mediante un HashMap almacenamos los valores que puede seleccionar el usuario para la operacion que quiere;
        Map<String, ItemMenu> mapItemMenuAritmetica = new HashMap<String, ItemMenu>();
        mapItemMenuAritmetica.put("1", new ItemMenu("Operación suma", new FuncionSuma()));
        mapItemMenuAritmetica.put("2", new ItemMenu("Operación resta", new FuncionResta()));
        mapItemMenuAritmetica.put("X", itemMenuExit);//la X significa la salida;

        Menu menuAritmetica = new Menu("Menú de Aritmética", introOpc, mapItemMenuAritmetica, this.sc);

        //Menú
        Map<String, ItemMenu> mapItemMenuAreaPi = new HashMap<String, ItemMenu>();
        mapItemMenuAreaPi.put("1", new ItemMenu("Área polígono regular", new FuncionArea()));
        mapItemMenuAreaPi.put("X", itemMenuExit);
        //mapItemMenuAreaPi.put("2", new ItemMenu("Tm. de Pitágoras", new FuncionResta()));

        Menu menuAreaPi = new Menu("Menú de área y Tm. de Pitágoras", introOpc, mapItemMenuAreaPi, this.sc);
        //Creo otro menú para calcular el área y el Tm de Pitágoras;
        Map<String, ItemMenu> mapItemMenuPrincipal = new HashMap<String, ItemMenu>();
        mapItemMenuPrincipal.put("A", new ItemMenu("Aritmética", menuAritmetica));
        mapItemMenuPrincipal.put("B", new ItemMenu("Área polígono regular y Tm. de Pitágoras", menuAreaPi));
        mapItemMenuPrincipal.put("X", itemMenuExit);

        this.menuPrincipal = new Menu("Menú principal de Supercalculadora", introOpc, mapItemMenuPrincipal, this.sc);
      
    }

    public Menu getMenuPrincipal() {
        return menuPrincipal;// método con el que obtengo el menu principal
    }

    public Scanner getSc() {
        return sc;
    }

}
