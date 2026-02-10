package MetodosOrdenamiento;

public class quickSort {
    public static void main(int[] arr) {
        int beg, end=arr.length;

        beg=0;
        quick_sort(arr, beg, end-1);
    }

    public static void quick_sort(int[] array, int begin, int end){
        int pivot=0;

        if(begin<end){                                             // condition to see if the array can continue with the recursion
            pivot=partition(array, begin, end);
            quick_sort(array, begin, pivot-1);                     // array with the smallest numbers
            quick_sort(array, pivot+1, end);                       // array with the greatest numbers
        }
    }

    // method to find a pivot
    public static int partition(int[] arr, int b, int e){
        int pivot=arr[e], i=b-1, j;

        for(j=b;j<=e-1;j++){                                       // elements from small to i are smaller after every iteration
            if(arr[j]<pivot){
                i++;
                intercambio(arr, i, j);
            }
        }
        intercambio(arr, i+1, e);                                  // move pivot after smaller elements
        return i+1;                                                // and return its position
    }

    public static void intercambio(int[] a, int fVar, int sVar){
        int temp=a[fVar];
        a[fVar]=a[sVar];
        a[sVar]=temp;
    }
}