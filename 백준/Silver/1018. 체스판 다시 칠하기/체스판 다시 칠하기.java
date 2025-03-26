import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }

        String black = "BWBWBWBW", white = "WBWBWBWB";
        int result = 64;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                String pattern1 = black;
                String pattern2 = white;
                int count1 = 0, count2 = 0;
                for (int k = i; k < i + 8; k++) {
                    int o = 0;
                    for (int l = j; l < j + 8; l++) {
                        if (input[k].charAt(l) != pattern1.charAt(o)) count1++;
                        if (input[k].charAt(l) != pattern2.charAt(o)) count2++;
                        o++;
                    }
                    pattern1 = pattern1.equals(black) ? white : black;
                    pattern2 = pattern2.equals(black) ? white : black;
                }
                result = Math.min(result, Math.min(count1, count2));
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }
}