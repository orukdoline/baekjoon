import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        long[] arr = new long[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextLong();
        }

        long max = arr[0];
        long min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min + " " + max);
    }
}