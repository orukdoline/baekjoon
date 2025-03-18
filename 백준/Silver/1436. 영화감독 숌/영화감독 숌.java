import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = 666;
        int count = 1;

        int N = Integer.parseInt(br.readLine());
        while (count < N) {
            num++;
            if (String.valueOf(num).contains("666")) count++;
        }
        bw.write(String.valueOf(num));
        bw.flush();
    }
}