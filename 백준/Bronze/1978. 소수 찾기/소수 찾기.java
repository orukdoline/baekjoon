import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] inputs = new int[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (inputs[i] <= 1) continue;
            int count = 0;
            for (int j = 2; j <= inputs[i] - 1; j++) {
                if (inputs[i] % j == 0) continue;
                else count++;
            }
            if (count == inputs[i] - 2) result++;
        }
        bw.write(result + "\n");
        bw.flush();
    }
}