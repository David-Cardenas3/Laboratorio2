
package laboratorio.pkg2;

import java.util.Scanner;

public class ReemplazarCaracteres {
    
    String NuevaCadena;
  
    public String ReemplazarCaracter(String cadena) {
              
       
      
       
        
        char MasRepetida = 0;
        int ContadorMasrepetida = 0;          
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {           
            contador = 0;
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j)) {
                    contador++;
                }
                if (contador > ContadorMasrepetida) {
                    ContadorMasrepetida = contador;
                    MasRepetida = cadena.charAt(i);
                }
            }
            

        }
        StringBuilder myName = new StringBuilder(cadena);

        for (int i = 0; i < cadena.length(); i++) {
            if(String.valueOf(cadena.charAt(i)).equals("a")|| String.valueOf(cadena.charAt(i)).equals("e") || String.valueOf(cadena.charAt(i)).equals("i")|| String.valueOf(cadena.charAt(i)).equals("o")|| String.valueOf(cadena.charAt(i)).equals("u")){
                cadena.replace(cadena.charAt(i), MasRepetida); 
                myName.setCharAt(i, MasRepetida);
            }
        }
        NuevaCadena = myName.toString();
        return NuevaCadena;
    }

}
