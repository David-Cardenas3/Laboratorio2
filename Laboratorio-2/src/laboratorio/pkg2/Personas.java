/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg2;

import java.util.Scanner;

public class Personas {
    public void RellenarPersonas() {
        
        MetodosOrdenamiento NuevoOrdenamiento = new MetodosOrdenamiento();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese La cantidad de personas:");
        num = sc.nextInt();

        Ejercicio4 arreglo[] = new Ejercicio4[num];
        String nombre;
        double cedula;
        int edad;
        for (int i = 0; i < arreglo.length; i++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese la cedula: ");
            cedula = sc.nextDouble();
            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();
            /*arreglo[i] = new Ejercicio4(nombre, cedula, edad);*/
        }
        for (int j = 0; j < arreglo.length; j++) {

            System.out.println("   Nombre       Cedula        Edad ");
            System.out.println("  " + arreglo[j].getnombre() + "     " + arreglo[j].getcedula() + "        " + arreglo[j].getedad());
        }
        /*NuevoOrdenamiento.BubbleSortPersonas(arreglo);
        for (int j = 0; j < arreglo.length; j++) {

            System.out.println("   Nombre       Cedula        Edad ");
            System.out.println("  " + arreglo[j].getnombre() + "     " + arreglo[j].getcedula() + "        " + arreglo[j].getedad());
        }*/
    }
}
