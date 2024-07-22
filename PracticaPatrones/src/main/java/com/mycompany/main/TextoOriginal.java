//Creamos una clase la cual implementara la interface FormatoTexto
//y por el momento nos devolvera el texto original
package com.mycompany.main;

public class TextoOriginal implements FormatoTexto {

    @Override
    public String formato(String texto){
        return texto;
    }
}
