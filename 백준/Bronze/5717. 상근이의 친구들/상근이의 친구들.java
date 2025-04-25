import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int male = Integer.parseInt(st.nextToken());
            int female = Integer.parseInt(st.nextToken());

            if (male == 0 && female == 0) break;
            bw.write(String.valueOf(male + female) + "\n");
        }
        bw.flush();
        bw.close();
    }
}