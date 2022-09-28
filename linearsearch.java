
public class linearsearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 3, 6, 8, 9, 1, 0 };
        int key = 1;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("The key is not in numbers");

        } else {
            System.out.println(index);
        }

    }

}
