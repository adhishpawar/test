import java.util.*;

public class ArrayCC {
    public static void main(String args[]) {
        int marks[] = new int[100];

        try (Scanner sc = new Scanner(System.in)) {
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();
        }

        System.out.println("Phy :" + marks[1]);
        System.out.println("chem :" + marks[2]);
        System.out.println("Maths :" + marks[2]);

    }
}
