package Sorting;

import java.util.Arrays;

public class

Sorting {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1,876,-9876,976,-879,-65,0};
        System.out.println("BubbleSort: " + Arrays.toString(bubbleSort(array)));
        System.out.println("SelectionSort: " + Arrays.toString(selectionSort(array)));
        System.out.println("InsertionSort: " + Arrays.toString(insertionSort(array)));
    }

    //Selection Sort Implementation(On^2):Not good for handling large data
    static int[] selectionSort(int[] array) {
        for(int i=0;i< array.length;i++){
            int last=array.length-1-i;
            int max=findMaxIndex(array,last);
            //function for swapping max index with last index
            swap(array,max,last);
        }
        return array;
        }
        static int findMaxIndex(int[] array,int last){
        int max=0;
        for(int i=1;i<=last;i++){
            if(array[i]>array[max]){
                max=i;
            }
        }

             return max;
        }

        static int[] swap(int[] array,int max,int last){
        int temp=array[last];
        array[last]=array[max];
        array[max]=temp;
        return array;
        }
    //Bubble Sort Implementation(On^2):Not good for handling large data
    static int[] bubbleSort(int[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swap = true;
                }


            }
            if (swap == false) {
                break;
            }
        }
        return array;
    }
      /*
      Insertion Sort(On^2):1)Adaptive:Steps gets reduced when array is sorted
                           2)Number of swaps are reduced as compared to bubble sort
                           3)Stable sorting algorithm
                           4)Array is partially sorted
                           5)Not good for handling large data
                           */
    static int[] insertionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array,j-1,j);
                }else{
                    break;
                }

            }
        }
        return array;
    }
}
