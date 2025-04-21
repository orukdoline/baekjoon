import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int value = input / 5;

        while (true) {
            if ((input - value * 5) % 3 != 0) {
                value--;
                continue;
            }
            if (value == -1) {
                bw.write(String.valueOf(-1));
                break;
            }
            bw.write(String.valueOf(value + (input - value * 5) / 3));
            break;
        }
        bw.flush();
        bw.close();
    }
}