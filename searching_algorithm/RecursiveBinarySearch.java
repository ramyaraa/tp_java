package searching_algorithm;
public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] list, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target not found
        }

        int midpoint = left + (right - left) / 2; // Calculate midpoint

        if (list[midpoint] == target) {
            return midpoint; // Target found
        } else if (list[midpoint] > target) {
            return recursiveBinarySearch(list, target, left, midpoint - 1); // Search in left half
        } else {
            return recursiveBinarySearch(list, target, midpoint + 1, right); // Search in right half
        }
    }

    public static void verify(int index) {
        if (index != -1) {
            System.out.println("Index found: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int target = 12;
        int result = recursiveBinarySearch(numbers, target, 0, numbers.length - 1);
        verify(result);

        target = 6;
        result = recursiveBinarySearch(numbers, target, 0, numbers.length - 1);
        verify(result);
    }
}

