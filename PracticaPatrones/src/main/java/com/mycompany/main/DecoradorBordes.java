package com.mycompany.main;
//Vamos a crear una clase para agregar bordes a los textos 
public class DecoradorBordes implements FormatoTexto {
    private FormatoTexto formatoTexto;

    public DecoradorBordes(FormatoTexto formatoTexto) {
        this.formatoTexto = formatoTexto;
    }
    @Override
    public String formato(String texto){
        String textoDecorado = formatoTexto.formato(texto);
        return "***************\n" + textoDecorado + "\n*********************";
    }
}
