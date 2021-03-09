
package laboratorio.pkg2;

import java.util.Scanner;


public class Laboratorio2 {

    
    public static void main(String[] args) {
     int media;
     int varianza;
   
        Scanner teclado = new Scanner(System.in);
        int tamaño;
        System.out.print("Porfavor Ingrese el tamaño del arreglo: ");
        tamaño = teclado.nextInt();
        int[] array = new int[tamaño];
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 20) + 1;
            System.out.println(array[x]);
        }
        Operaciones NuevaOperacion = new Operaciones();
        MetodosOrdenamiento NuevoOrdenamiento = new MetodosOrdenamiento();
        int opcion = 0;
        do {
            System.out.println("Seleccione la opción que desee");
            System.out.println("1 - Ordenar");
            System.out.println("2 - Media");
            System.out.println("3 - Varianza");
            System.out.println("4 - Desviacion Estandar");
            System.out.println("5 - Reemplazar caracter");
            System.out.print("Digite la opcion: ");
            opcion = Integer.parseInt(teclado.next());

            switch (opcion) {
                case 1:
                    NuevoOrdenamiento.sort(array, 0, array.length-1);
                            
                    break;
                case 2:
                    NuevaOperacion.media(array);
                    break;
                case 3:
                    NuevaOperacion.Varianza(array);
                    break;
                case 4:
                    NuevaOperacion.Desviacion(array);
                    break;
                case 5:
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
        } while (opcion != 5);
    }
}
