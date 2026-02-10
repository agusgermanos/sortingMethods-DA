package MetodosOrdenamiento;

public class optimizedBubbleSort {
    public static void main(int[] arr) {
        int i, j, aux;
        boolean flag=false;

        // bucle con la condicion que corte antes del total del arreglo y cuando la bandera sea verdadera
        i=0;
        while(i<arr.length-1 && !(flag)){
            flag=true;
            for(j=0;j<arr.length-1-i;j++){          // bucle interno de burbujeo
                if(arr[j]>arr[j+1]){                // condicion para que los menores pasen adelante y los mayores atras
                    flag=false;                     // cambio la bandera para que haya mas iteraciones
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }
            }
            i++;
        }
    }
}