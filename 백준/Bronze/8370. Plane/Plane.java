import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for (int i = 0; i < 2; i++) {
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            result += N * M;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
    }
}