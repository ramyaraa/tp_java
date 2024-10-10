package searching_algorithm;

public class BinarySearch {
    public static Integer binarySearch(int[] list, int target) {
        int first = 0;
        int last = list.length - 1;

        while (first <= last) {
            int midpoint = (first + last) / 2;

            if (list[midpoint] == target) {
                return midpoint;
            } else if (list[midpoint] < target) {
                first = midpoint + 1;
            } else {
                last = midpoint - 1;
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

        Integer result = binarySearch(numbers, 12);
        verify(result);
        result = binarySearch(numbers, 6);
        verify(result);
    }
}

