import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        char[] alphabet = br.readLine().toCharArray();

        long result = 0;
        for (int i = 0; i < L; i++) {
            result = (long)((alphabet[i] - 'a' + 1) * Math.pow(31, i) + result) % 1234567891;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}