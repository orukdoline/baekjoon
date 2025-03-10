import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scores = new double[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        double maxScore = scores[0];
        int maxIndex = 0;
        for (int i = 1; i < N; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < N; i++) scores[i] = scores[i] / maxScore * 100.0;

        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += scores[i];
            if (i == N - 1) {
                bw.write(sum / N + "\n");
                bw.flush();
            }
        }
    }
}