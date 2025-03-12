import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] apartment = new int[k + 1][n];
            for (int j = 0; j <= k; j++) {
                for (int l = 0; l < n; l++) {
                    int total = 0;
                    if (j == 0) total = l + 1;
                    else {
                        for (int m = 0; m <= l; m++) total += apartment[j - 1][m];
                    }
                    apartment[j][l] = total;
                }
            }

            bw.write(apartment[k][n - 1] + "\n");
            bw.flush();
        }
    }
}