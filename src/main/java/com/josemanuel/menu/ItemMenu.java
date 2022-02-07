package com.josemanuel.menu;

import java.util.Scanner;
import java.util.function.Function;

public class ItemMenu {

    private String mensajeMenu;
    private Menu subMenu;
    private Function<Scanner, Void> itemMenuFuncion;

    public ItemMenu(String mensajeMenu, Menu subMenu) { //creamos el constructor que contiene un mensajeMenu y un submenu
        this.subMenu = subMenu;
        this.mensajeMenu = mensajeMenu;        
    }

//sobrecargamos el constructor
    public ItemMenu(String mensajeMenu, Function<Scanner, Void> itemMenuFuncion) {
        this.mensajeMenu = mensajeMenu;
        this.itemMenuFuncion = itemMenuFuncion;
    }
// método getter para obtener subMenu
    public Menu getSubMenu() {
        return subMenu;
    }
//método setter del menú
    public void setSubMenu(Menu subMenu) {
        this.subMenu = subMenu;
    }

    public String getMensajeMenu() {
        return mensajeMenu;
    }

    public void setMensajeMenu(String mensajeMenu) {
        this.mensajeMenu = mensajeMenu;
    }

    public Function<Scanner, Void> getItemMenuFuncion() {
        return itemMenuFuncion;
    }

}
