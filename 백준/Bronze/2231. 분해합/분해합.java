import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            int digit = 0;
            int num = N;
            while (num > 0) {
                num /= 10;
                digit++;
            }

            int[] arr = new int[digit];
            num = i;
            for (int j = 0; j < digit; j++) {
                arr[digit - j - 1] = num % 10;
                num /= 10;
            }

            num = i;
            for (int j = 0; j < arr.length; j++) {
                num += arr[j];
            }

            if (num == N) {
                bw.write(i + "\n");
                bw.flush();
                break;
            }
            if (i == N) {
                bw.write("0\n");
                bw.flush();
            }
        }
    }
}