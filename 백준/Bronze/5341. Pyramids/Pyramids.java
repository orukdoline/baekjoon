import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int input = Integer.parseInt(br.readLine()), result = 0;
            if (input == 0) break;
            for (int i = 1; i <= input; i++) result += i;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}