import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (input - i > j + 1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}