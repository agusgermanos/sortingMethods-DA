package MetodosOrdenamiento;

public class mergeSort {
    public static void main(int[] arr) {
        int beg=0, fin=arr.length;
        merge_sort(arr, beg, fin-1);
    }

    // this is the recursive method to divide the principal array
    public static void merge_sort(int[] array, int begin, int fin){
        int mid;

        if(begin>=fin){                         // if the sub-array has one element or nothing, it has already organized
            System.out.println("The array has already organized");
        }else{
            mid=(begin+fin)/2;
            merge_sort(array, begin, mid);      // recursive method for the first part of the array
            merge_sort(array, mid+1, fin);      // recursive method for the second part of the array
            merge(array, begin, mid, fin);      // now, it has to mix them to show an organized array
        }
    }

    // this is the method to mix the previous arrays
    public static void merge(int[] array, int begin, int middle, int end){
        int i, j, k;
        int[] newArr=new int[end-begin+1];   // organized array

        i=begin;
        j=middle+1;
        k=0;
        while(i<=middle && j<=end){          // repetitive to loop through both sub-arrays
            if(array[i]>array[j]){           // if array[i] is bigger than array[j], then the new array save the element of the array[j]
                newArr[k]=array[j];
                j++;                         // increment the position of the array[j]
            }else{                           // if the array[i] is smaller than array[j], the new array save the element of the array[i]
                newArr[k]=array[i];
                i++;                         // increment the position of the array[i]
            }
            k++;                             // increment the position of the final array
        }

        while(i<=middle){                    // this is the leftover of the array[i]
            newArr[k]=array[i];
            i++;
            k++;
        }

        while(j<=end){                       // this is the leftover of the array[j]
            newArr[k]=array[j];
            j++;
            k++;
        }
        
        for(i=0;i<newArr.length;i++) {      // i rewrite the organized elements in the previous array
            array[begin+i]=newArr[i];
        }
    }
}
