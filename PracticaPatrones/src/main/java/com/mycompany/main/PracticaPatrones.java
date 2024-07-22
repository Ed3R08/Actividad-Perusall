package com.mycompany.main;

public class PracticaPatrones {

    public static void main(String[] args) {
        Logger logger = Logger.getInstancia();
        logger.log("Este es el mensaje guardado de la clase Logger(Singleton)"
                + " en el metodo log.\n");

        String texto = " Texto que vamos a decorar y aplicar el patron estructural decorator";
        FormatoTexto textoOriginal = new TextoOriginal();
        System.out.println("\nTexto sin cambios: ");
        System.out.println(textoOriginal.formato(texto));
        
        FormatoTexto textoConBordes = new DecoradorBordes (new TextoOriginal());
        System.out.println("\nTexto con bordes: ");
        System.out.println(textoConBordes.formato(texto));
        
        FormatoTexto textoMayuscula = new TextoMayusculas (new TextoOriginal());
        System.out.println("\nTexto en mayusculas: ");
        System.out.println(textoMayuscula.formato(texto));
        
        FormatoTexto textoMayusculaYConBordes = new TextoMayusculas(new DecoradorBordes (new TextoOriginal()));
        System.out.println("\nTexto en mayuscula y con bordes: ");
        System.out.println(textoMayusculaYConBordes.formato(texto));
    
        //Creamos el canal de informacion o la instancia Info
        Info info = new Info();
        //Agregamos suscriptores
        Observer subscriber1 = new Subscriber("Suscriptor 1");
        Observer subscriber2 = new Subscriber("Suscriptor 2");
        Observer subscriber3 = new Subscriber("Suscriptor 3");
        
        //Ahora los agregamos a Info
        info.subscribe(subscriber1);
        info.subscribe(subscriber2);
        info.subscribe(subscriber3);
    
        //Publicamos algo de informacion 
        System.out.println("INFORMACIÓN IMPORTANTE");
        info.Info("Estamos usando el patron de comportamiento(observer)");
        
        //Desinscribir a un suscriptor
        info.unsubscribe(subscriber3);
        
        //Publicamos algo mas
        System.out.println("Prueba de implementacion de patron de comportamiento(observer)");
        info.Info("quedan solo 2 subscriptores");
    }
    
}
