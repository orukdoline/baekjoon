import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] height = new int[N];
        int[] weight = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            height[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[N];
        int result = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (height[i] < height[j] && weight[i] < weight[j]) {
                    result++;
                }
            }
            rank[i] = result;
            result = 1;
        }

        for (int i = 0; i < N; i++) {
            bw.write(rank[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}