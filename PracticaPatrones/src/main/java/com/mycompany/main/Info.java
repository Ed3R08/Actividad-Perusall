//Creo una clase para simular la entrega de informacion a las personas inscritas en un canal por asi decirlo o app
package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;

public class Info implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String info;
    
    @Override
    public void subscribe (Observer observer){
        subscribers.add(observer);
    }
    @Override
    public void unsubscribe (Observer observer){
        subscribers.remove(observer);
    }
    @Override
    public void notifyUsers(){
        for (Observer observer : subscribers){
            observer.update(info);
        }
    }

    public void Info(String info) {
        this.info = info;
        notifyUsers();
    }
   
}

