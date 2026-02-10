package MetodosOrdenamiento;

public class heapSort {
    public static void main(int[] array){
        heap_sort(array);
    }

    // method to build a binary tree from the lowest to the greatest number
    public static void heap_sort(int[] arr){
        int lengthArray=arr.length, i, temp;

        // build heap
        for(i=lengthArray/2-1;i>=0;i--){
            heapify(arr, lengthArray, i);
        }

        // to put the greatest number to the last position of the array 
        for(i=lengthArray-1;i>0;i--){
            temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr, i, 0);
        }
    }

    // method to find the greatest candidate number to put it on the father node
    public static void heapify(int[] arr, int len, int it){
        int largest=it, leftNode=it*2+1, rightNode=it*2+2, temp;

        // if the position exists and the left node is greater than the father node, save the position of the left node
        if(leftNode<len && arr[leftNode]>arr[largest]){
            largest=leftNode;
        }
        
        // if the position exists and the right node is greater than the father node, save the position of the right node
        if(rightNode<len && arr[rightNode]>arr[largest]){
            largest=rightNode;
        }

        // if the position has changed, it means that we have to change a son node with a father node
        if(largest!=it){
            temp=arr[largest];
            arr[largest]=arr[it];
            arr[it]=temp;

            heapify(arr, len, largest);         // continue with the sub-tree of the lowest number
        }
    }
}