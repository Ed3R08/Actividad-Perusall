//Patron creacional Singleton, nos permite que una clase tenga una sola
// instancia, para manejar recursos compartidos.
package com.mycompany.main;
//La clase logger la uso como ejemplo de loggeo a un sistema donde necesitamos solo  halla una instancia de dicha clase
public class Logger {
    //creamos la unica instancia de Logger (patron singleton)
    private static Logger instancia;
    //Constriuctor privado que evita la creacion de instancias adicionales 
    private Logger() {}
    // Creamos el metodo getInstancia que nos permite obtener la unica instancia de esta clase
    // si la instancia no existe la crea
    public static synchronized Logger getInstancia(){
        if (instancia == null){
            instancia = new Logger();
        }
        return instancia;
    }
    //Metodo para registrar un mensaje 
    public void log(String mensaje){
        System.out.print(mensaje);
    }
}
   
   

   
