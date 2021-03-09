package laboratorio.pkg2;

public class Operaciones {

    double media = 0.0;
    double desviacion = 0.0;
    double varianza = 0.0;
   
    
    
    public void media(int[] array) {
        double suma = 0.0;

        for (int x = 0; x < array.length; x++) {
            suma = suma + array[x];
        }
        media = (suma / array.length);

        System.out.println("La media aritmetica del vector es: " + media);

    }

    public void Varianza(int[] array) {
        

        for (int i = 0; i < array.length; i++) {
            double rango;
            rango = Math.pow(array[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / array.length;

        System.out.println("La Varianza del vector es: " + varianza);     

    }
    
    public void Desviacion(int[] array) {
    {       
        desviacion = Math.sqrt(varianza);
        System.out.println("La Desviacion Estandar del vector es: " + desviacion);
    }
}
}
