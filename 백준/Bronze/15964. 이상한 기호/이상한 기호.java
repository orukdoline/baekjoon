import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long first = sc.nextLong();
        long second = sc.nextLong();
        System.out.println(solve(first, second));
    }
    
    private static long solve(long first, long second) {
        return (first + second) * (first - second);
    }
}