package com.adecco.presentacion;

import com.adecco.modelo.Saludo;

public class Main {
    public static void main(String[] args) {
        Saludo s1 = new Saludo();
        s1.setMensajeSaludo("Bienvenido al mundo ");
        System.out.println(s1.saludar("Luis Rodriguez"));

        Saludo s2 = new Saludo();
        s2.setMensajeSaludo("Bienvenido Mr Marshall");
        System.out.println(s2.getMensajeSaludo());
    }

}