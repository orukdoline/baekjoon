import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");

        int count = 0;
        for (String word : words) {
            //System.out.println("\"" + word + "\"");
            if (!word.isBlank()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
