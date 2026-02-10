package MetodosOrdenamiento;

public class bubbleSort {
    public static void main(int[] arr) {
        int i, j, num;
       
        // bucle que termina cuando llega a la última dirección del arreglo
        for(i=0;i<arr.length-1;i++){
            // bucle que irá disminuyendo a medida que los números "burbujeen"
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    num=arr[j];                 // variable auxiliar que guarda el dato contenido en la posición j
                    arr[j]=arr[j+1];            // en la posicion j lo intercambio por el siguiente menor
                    arr[j+1]=num;               // en la siguiente posición está el mas grande
                }
            }
        }
    }
}
