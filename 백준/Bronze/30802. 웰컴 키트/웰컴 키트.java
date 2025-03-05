import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] size = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int TShirtsNum = 0;
        for (int i = 0; i < size.length; i++) {
            TShirtsNum += size[i] / T;
            if (size[i] % T != 0) TShirtsNum++;
        }

        int pencilNum = N / P;
        int pencilRest = N % P;

        bw.write(TShirtsNum + "\n");
        bw.write(pencilNum + " " + pencilRest + "\n");
        bw.flush();
    }
}