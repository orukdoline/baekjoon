import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input = sc.next();
        
        int result = 0;
        for (int i = 0; i < count; i++) {
            char c = input.charAt(i);
            result += c - '0';
        }
        System.out.println(result);
    }
}