import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(solve(N) / (solve(K) * solve(N - K))));
        bw.flush();
    }

    private static int solve(int n) {
        if (n == 0) return 1;
        for (int i = n - 1; i > 0; i--) n *= i;
        return n;
    }
}