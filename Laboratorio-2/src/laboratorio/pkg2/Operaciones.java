package laboratorio.pkg2;

import java.util.Scanner;

public class Operaciones {

    double media;
    double desviacion;
    double varianza;

    
  
    CreacionArreglos ArregloInt = new CreacionArreglos();
    public double media(int[] ArrayInterfaz) {
        double suma = 0.0;

        for (int x = 0; x < ArrayInterfaz.length; x++) {
            suma = suma + ArrayInterfaz[x];
        }
        media = (suma / ArrayInterfaz.length);       
        return media;
    }

    public double Varianza(int[] ArrayInterfaz) {
        int n = ArrayInterfaz.length;
        for (int i = 0; i < ArrayInterfaz.length; i++) {
            double rango;
            rango = Math.pow(ArrayInterfaz[i] - media, 2);
            varianza = varianza + rango;
        }
        varianza = varianza / n;       
        return varianza;
    }

    public double Desviacion(int[] ArrayInterfaz) {
        {
            desviacion = Math.sqrt(varianza);            
        }
        return desviacion;
    } 
    
   
}
