package MetodosOrdenamiento;

public class selectionSort {
    public static void main(int[] arr) {
        int i, aux, smallest;

        // repetitive to advance in the array
        for(i=0;i<arr.length;i++){
            smallest=findTheSmallest(arr, i);               // i call to module
            if(arr[smallest]<arr[i]){                       // condition to change the smallest number to the first position
                aux=arr[i];
                arr[i]=arr[smallest];
                arr[smallest]=aux;
            }
        }
    }

    public static int findTheSmallest(int[] array, int i){
        int j, posi=i, num=array[i];                        

        for(j=i;j<array.length;j++){                        // repetitive to find the smallest number
            if(num>array[j]){                               // condition to select which is the smallest number
                num=array[j];
                posi=j;                                     // i will only return the position of the number
            }
        }
        return posi;
    }
}
