import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] triangle = new int[3];
            for (int i = 0; i < 3; i++) {
                triangle[i] = sc.nextInt();
            }

            if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) break;

            int result = 0;
            int count = 0;
            while (true) {
                if (triangle[count] > triangle[count + 1]) {
                    int temp = triangle[count];
                    triangle[count] = triangle[count + 1];
                    triangle[count + 1] = temp;
                } else {
                    result++;
                }
                if (result == triangle.length - 1) break;
                count++;
                if (count == triangle.length - 1) {
                    count = 0;
                }
            }

            if (Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
