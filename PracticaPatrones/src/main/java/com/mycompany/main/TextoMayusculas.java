//Continuamos con decorator patron estructural
package com.mycompany.main;
//Vamos a cambiar el texto a mayusculas en la siguiente clase
public class TextoMayusculas  implements FormatoTexto{
    private FormatoTexto formatoTexto;

    public TextoMayusculas(FormatoTexto formatoTexto) {
        this.formatoTexto = formatoTexto;
    }
    
    @Override
    public String formato(String texto){
        String textoDecorado = formatoTexto.formato(texto);
        return textoDecorado.toUpperCase();
    }
    
}


