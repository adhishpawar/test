public class binarysearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 18, 23, 5, 6, 23, 7, 3, 15, 6 };

        System.out.println("the index of key is: " + binarySearch(numbers, 6));

    }

}
