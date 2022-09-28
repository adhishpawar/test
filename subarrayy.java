public class subarrayy {
    public static void printSubarray(int adhish[]) {
        for (int i = 0; i < adhish.length; i++) {
            int start = i;
            for (int j = 1; j < adhish.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.println(adhish[k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }

    public static void main(String args[]) {
        int adhish[] = { 2, 4, 6, 8, 10 };
    }

}
