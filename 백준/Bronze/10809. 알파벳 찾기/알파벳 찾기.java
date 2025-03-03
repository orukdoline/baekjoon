import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (chars[i] == 'a' + j && alphabet[j] == -1) {
                    alphabet[j] = i;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(alphabet[i] + " ");
        }
        bw.flush();
    }
}