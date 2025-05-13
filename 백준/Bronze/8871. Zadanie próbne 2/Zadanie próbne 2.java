import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int min = (n + 1) * 2;
        int max = (n + 1) * 3;

        bw.write(min + " " + max + "\n");
        bw.flush();
        br.close();
    }
}