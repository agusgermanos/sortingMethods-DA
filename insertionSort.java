package MetodosOrdenamiento;

public class insertionSort {
    public static void main(int[] arr) {
        int i, j, aux;

        // repetitive to control the iterations
        for(i=1;i<arr.length;i++){
            aux=arr[i];                         // i save the number to compare it with the previous one
            j=i;                                // initialization of the next repetitive
            while(j>0 && aux<arr[j-1]){         // i control that the index doesn't leave the array
                arr[j]=arr[j-1];                // if arr[i] is smaller than the previous one, they have to change their positions
                j--;                            // decrement the position
            }
            arr[j]=aux;                         // "definite" change
        }
    }
}