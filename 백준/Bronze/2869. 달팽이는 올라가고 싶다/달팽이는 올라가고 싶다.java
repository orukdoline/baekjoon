import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(input.nextToken());
        int B = Integer.parseInt(input.nextToken());
        int V = Integer.parseInt(input.nextToken());

        if ((V - B) % (A - B) == 0) bw.write(String.valueOf((V - B) / (A - B)));
        else bw.write(String.valueOf((V - B) / (A - B) + 1));
        bw.flush();
    }
}