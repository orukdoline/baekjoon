import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
    }
}