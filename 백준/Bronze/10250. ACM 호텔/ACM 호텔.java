import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] height = new int[count];
        int[] width = new int[count];
        int[] customer = new int[count];

        for (int i = 0; i < count; i++) {
            height[i] = sc.nextInt();
            width[i] = sc.nextInt();
            customer[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int floor = 0;
            int roomNo = 0;
            if (customer[i] % height[i] == 0) {
                floor = height[i];
                roomNo = customer[i] / height[i];
            } else {
                floor = customer[i] % height[i];
                roomNo = customer[i] / height[i] + 1;
            }
            System.out.printf("%d%02d\n", floor, roomNo);
        }
    }
}