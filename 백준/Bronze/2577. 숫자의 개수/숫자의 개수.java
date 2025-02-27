import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 1;
        for (int i = 0; i < 3; i++) {
            input *= sc.nextInt();
        }

        String inputString = String.valueOf(input);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < inputString.length(); j++) {
                if (inputString.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
