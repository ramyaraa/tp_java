package sorting_algorithm;

import java.lang.reflect.Array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,2,8,6,4,1,7,3,5,10};

        for(int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap the number
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        // this is desplay the output
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1){
                System.out.print(arr[i]+" - ");
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
    
}
