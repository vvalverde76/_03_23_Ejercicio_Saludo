package com.adecco.presentacion;

import com.adecco.modelo.Saludo;

public class Main {
    public static void main(String[] args) {
        Saludo s1 = new Saludo();
        System.out.println(s1.saludar("Luis Rodriguez"));
    }
}