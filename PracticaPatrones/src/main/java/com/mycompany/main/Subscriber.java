
package com.mycompany.main;

public class Subscriber implements Observer{
    private String nombre;

    public Subscriber(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void update (String mensaje){
        System.out.println(nombre + " recibio la noticia: " + mensaje);
    }
}
