import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        char[] alphabet = br.readLine().toCharArray();

        long result = 0L;
        long pow = (long)Math.pow(31, 0);
        for (int i = 0; i < L; i++) {
            result = ((alphabet[i] - 'a' + 1L) * pow + result) % 1234567891;
            pow = pow * 31 % 1234567891;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}