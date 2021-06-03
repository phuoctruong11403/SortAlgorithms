import java.util.*;
public class HeapSort {
   public static void heapify(int[] arr, int i, int size)
   {
       int left = 2*i+1;
       int right = 2*i+2;
       int max;
        if (left <= size && arr[left] >= arr[i])
            max = left;
        else 
            max = i;

        if (right <= size && arr[right] >= arr[max])
            max = right;

        if (max != i){
            exchange(arr, i, max);
            heapify(arr, max, size);
        }
   }

   public static void exchange(int[] arr, int i, int j)
   {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }

   public static void buildHeap (int[] arr)
   {
       for (int i = (arr.length - 1)/2; i>= 0; i--)
            heapify(arr, i, arr.length-1);
   }

   public static void heapSort(int[] arr)
   {
       buildHeap(arr);
       int sizeOfHeap = arr.length-1;
       for (int i = sizeOfHeap; i > 0; i--)
       {
           exchange(arr, 0, i);
           sizeOfHeap--;
           heapify(arr,0, sizeOfHeap);
       }
   }
    public static void main(String[] args) {
        int[] arr={1,10,16,19,3,5};
        System.out.println("Before Heap Sort : ");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("=====================");
        System.out.println("After Heap Sort : ");
        System.out.println(Arrays.toString(arr));
    }
}
