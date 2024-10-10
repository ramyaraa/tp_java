package searching_algorithm;

public class LinerSearch {
    public static Integer linearSearch(int[] list, int target) {


        for(int i=0; i < list.length;i++) {
            if(list[i]== target){
                return i;
            }
        }
        return null;
    }

    public static void verify(Integer index) {
        if (index != null) {
            System.out.println("index found: " + index);
        } else {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Integer result = linearSearch(numbers, 12);
        verify(result);
        result = linearSearch(numbers, 6);
        verify(result);
    }
}

