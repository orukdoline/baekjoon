import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = new int[chess.length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < chess.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < input.length; i++) {
            bw.write(chess[i] - input[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}