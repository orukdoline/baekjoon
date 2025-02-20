import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumTotal = 0;
        for (int i = 0; i < 5; i++) {
            sumTotal += Math.pow(sc.nextInt(), 2);
        }
        System.out.println(sumTotal % 10);
    }
}