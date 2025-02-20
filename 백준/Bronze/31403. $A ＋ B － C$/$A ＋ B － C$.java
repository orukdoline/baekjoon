import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[3];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println(input[0] + input[1] - input[2]);
        System.out.println(Integer.parseInt("" + input[0] + input[1]) - input[2]);     
    }
}