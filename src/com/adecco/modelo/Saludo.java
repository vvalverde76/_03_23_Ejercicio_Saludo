package com.adecco.modelo;

public class Saludo {
    private String mensajeSaludo;
    public String saludar(String nombreUsuario){
       return mensajeSaludo + nombreUsuario;

   }

    public String getMensajeSaludo() {
        return mensajeSaludo;
    }

    public void setMensajeSaludo(String mensajeSaludo) {
        this.mensajeSaludo = mensajeSaludo;
    }
}
