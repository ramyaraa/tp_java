package sorting_algorithm;
public class BubbleSort{
    public static void main(String[] args) {

        int[] arr = new int[]{9,2,8,6,4,1,7,3,5,10};

        //this is check if number1 is greater than number 2 then swap them
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        // this is desplay the output
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" - ");
        }
        
    }
}