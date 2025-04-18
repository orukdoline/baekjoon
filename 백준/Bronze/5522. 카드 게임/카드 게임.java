import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int input = Integer.parseInt(br.readLine());
            result += input;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}