package laboratorio.pkg2;



public class MetodosOrdenamiento {
    public void ArregloaOrdenar(int[] array){
        for(int i=0; i < array.length;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println();
    }
   public void Merge(int array[], int l, int m, int r) 
    { 

        int num1 = m - l + 1; 
        int num2 = r - m; 
        int I[] = new int [num1]; 
        int D[] = new int [num2];   
        for (int i=0; i<num1; ++i) 
            I[i] = array[l + i]; 
        for (int j=0; j<num2; ++j) 
            D[j] = array[m + 1+ j]; 
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < num1 && j < num2) 
        { 

            if (I[i] <= D[j]) 
            { 
                array[k] = I[i]; 
                i++; 
            } 
            else
            { 
                array[k] = D[j]; 
                j++; 
            } 
            k++; 
        } 
        ArregloaOrdenar(array);
        while (i < num1) 
        { 
            array[k] = I[i]; 
            i++; 
            k++; 
        } 
        ArregloaOrdenar(array);

        while (j < num2) 
        { 
            array[k] = D[j]; 
            j++; 
            k++; 
        } 
        ArregloaOrdenar(array);
    }
     void sort(int array[], int extremoIzquierdo, int extremoDerecho) 
    { 
        if (extremoIzquierdo < extremoDerecho) 
        { 
            int puntoMedio = (extremoIzquierdo+extremoDerecho)/2; 
  
            sort(array, extremoIzquierdo, puntoMedio); 

            sort(array , puntoMedio+1, extremoDerecho); 
  
            Merge(array, extremoIzquierdo, puntoMedio, extremoDerecho); 
        } 
    }
}

