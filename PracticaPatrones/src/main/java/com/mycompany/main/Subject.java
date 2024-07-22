//Creo la interfaz para meter los metodos que se van a encargar de agregar eliminar y notificar los observer
package com.mycompany.main;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyUsers();
    
}
