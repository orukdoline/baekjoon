import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = hour * 3600 + minute * 60;
        
        int resultHour = (second - 45 * 60) / 3600;
        int resultMinute = (second - 45 * 60) % 3600 / 60;
        
        if (resultMinute < 0) {
        	resultHour = 23;
        	resultMinute = 60 + resultMinute;
        }
        System.out.println(resultHour + " " + resultMinute);
    }
}