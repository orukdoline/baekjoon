import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) bw.write("1\n");
        else {
            int result = 2;
            int value = 6;
            int count = 2;
            while (true) {
                result += value;
                value = count * 6;
                if (result > N) break;
                else count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
    }
}