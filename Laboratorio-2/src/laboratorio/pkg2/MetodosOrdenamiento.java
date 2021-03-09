package laboratorio.pkg2;

import java.util.Arrays;
import java.util.Scanner;

public class MetodosOrdenamiento {
    
    String ArregloOrdenado1;
    String TiempoInsertionSort;
    String TiempoBubbleSort;
    String TiempoSelectionSort;
    String ArregloOrdenadoInsertionSort;
    String ArregloOrdenadoBubbleSort;
    String ArregloOrdenadoSelectionSort;

    public void ArregloOrdenarDouble(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println();
    }

    public void ArregloOrdenarInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public void Merge(double arreglo[], int l, int m, int r) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();

        int num1 = m - l + 1;
        int num2 = r - m;
        double I[] = new double[num1];
        double D[] = new double[num2];
        for (int i = 0; i < num1; ++i) {
            I[i] = arreglo[l + i];
        }
        for (int j = 0; j < num2; ++j) {
            D[j] = arreglo[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < num1 && j < num2) {

            if (I[i] <= D[j]) {
                arreglo[k] = I[i];
                i++;
            } else {
                arreglo[k] = D[j];
                j++;
            }
            k++;
        }
        ArregloOrdenarDouble(arreglo);
        while (i < num1) {
            arreglo[k] = I[i];
            i++;
            k++;
        }
        ArregloOrdenarDouble(arreglo);

        while (j < num2) {
            arreglo[k] = D[j];
            j++;
            k++;
        }
        ArregloOrdenarDouble(arreglo);
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        
    }

    void sort(double arreglo[], int extremoIzquierdo, int extremoDerecho) {

        if (extremoIzquierdo < extremoDerecho) {
            int puntoMedio = (extremoIzquierdo + extremoDerecho) / 2;

            sort(arreglo, extremoIzquierdo, puntoMedio);

            sort(arreglo, puntoMedio + 1, extremoDerecho);

            Merge(arreglo, extremoIzquierdo, puntoMedio, extremoDerecho);
        }

    }

    public String BubbleSort(double[] ArregloDoubleInterfaz) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        for (int cont1 = 0; cont1 < ArregloDoubleInterfaz.length; cont1++) {
            for (int cont2 = 0; cont2 < ArregloDoubleInterfaz.length; cont2++) {
                if ((cont2 + 1) < ArregloDoubleInterfaz.length) {
                    if (ArregloDoubleInterfaz[cont2] > ArregloDoubleInterfaz[cont2 + 1]) {
                        double t = ArregloDoubleInterfaz[cont2];
                        ArregloDoubleInterfaz[cont2] = ArregloDoubleInterfaz[cont2 + 1];
                        ArregloDoubleInterfaz[cont2 + 1] = t;
                    }
                }
            }
            ArregloOrdenarDouble(ArregloDoubleInterfaz);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        TiempoBubbleSort = String.valueOf(tiempo);
        ArregloOrdenadoBubbleSort = Arrays.toString(ArregloDoubleInterfaz);
        return ArregloOrdenadoBubbleSort;
    }

    public String InsertionSort(double[] ArregloDoubleInterfaz ) {
        long startTime;
        long endTime;
        long tiempo;
        startTime = System.currentTimeMillis();
        ArregloOrdenarDouble(ArregloDoubleInterfaz);
        for (int lugar = 1; lugar < ArregloDoubleInterfaz.length; lugar++) {
            int contComparacion = lugar;
            double numEvaluado = ArregloDoubleInterfaz[lugar];
            while (ArregloDoubleInterfaz[contComparacion - 1] > numEvaluado && contComparacion > 0) {
                ArregloDoubleInterfaz[contComparacion] = ArregloDoubleInterfaz[contComparacion - 1];
                contComparacion--;
                if (contComparacion == 0) {
                    break;
                }
            }
            ArregloDoubleInterfaz[contComparacion] = numEvaluado;
            ArregloOrdenarDouble(ArregloDoubleInterfaz);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        TiempoInsertionSort = String.valueOf(tiempo);
        ArregloOrdenadoInsertionSort = Arrays.toString(ArregloDoubleInterfaz);
        return ArregloOrdenadoInsertionSort;
    }

    public String SelectionSort(double[] ArregloDoubleInterfaz) {
        long startTime;
        long endTime;
        long tiempo;
        
        startTime = System.currentTimeMillis();
        for (int lugarArreglo = 0; lugarArreglo < ArregloDoubleInterfaz.length; lugarArreglo++) {
            int lugarMinimo = lugarArreglo;
            for (int posicion = lugarArreglo; posicion < ArregloDoubleInterfaz.length; posicion++) {
                if (ArregloDoubleInterfaz[posicion] < ArregloDoubleInterfaz[lugarMinimo]) {
                    lugarMinimo = posicion;
                }
            }
            double t = ArregloDoubleInterfaz[lugarArreglo];
            ArregloDoubleInterfaz[lugarArreglo] = ArregloDoubleInterfaz[lugarMinimo];
            ArregloDoubleInterfaz[lugarMinimo] = t;
            ArregloOrdenarDouble(ArregloDoubleInterfaz);
        }
        endTime = System.currentTimeMillis();
        tiempo = endTime - startTime;
        TiempoSelectionSort = String.valueOf(tiempo);
        ArregloOrdenadoSelectionSort = Arrays.toString(ArregloDoubleInterfaz);
        return ArregloOrdenadoSelectionSort;
        
    }

    /*public void BubbleSortPersonas(Ejercicio4[] arreglo) {

        for (int cont1 = 0; cont1 < arreglo.length; cont1++) {
            for (int cont2 = 0; cont2 < arreglo.length; cont2++) {
                if ((cont2 + 1) < arreglo.length) {
                    if (arreglo[cont2].getedad() > arreglo[cont2 + 1].getedad()) {
                        Ejercicio4 tempo = new Ejercicio4();
                        tempo = arreglo[cont2];
                        arreglo[cont2] = arreglo[cont2 + 1];
                        arreglo[cont2 + 1] = tempo;
                    }
                }
            }

        }

    }*/
    
    public String BubbleSortOperaciones(int[] NuevoArregloInicial) {
        
       
        for (int cont1 = 0; cont1 < NuevoArregloInicial.length; cont1++) {
            for (int cont2 = 0; cont2 < NuevoArregloInicial.length; cont2++) {
                if ((cont2 + 1) < NuevoArregloInicial.length) {
                    if (NuevoArregloInicial[cont2] > NuevoArregloInicial[cont2 + 1]) {
                        int t = NuevoArregloInicial[cont2];
                        NuevoArregloInicial[cont2] = NuevoArregloInicial[cont2 + 1];
                        NuevoArregloInicial[cont2 + 1] = t;
                    }
                }
            }
            
        }
        ArregloOrdenado1 = Arrays.toString(NuevoArregloInicial);
        
        return ArregloOrdenado1;
    }
}
