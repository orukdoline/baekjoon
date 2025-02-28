import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[8];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] - input[i + 1] != -1) ascending = false;
            if (input[i] - input[i + 1] != 1) descending = false;
        }

        if (ascending) System.out.println("ascending");
        else if (descending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
