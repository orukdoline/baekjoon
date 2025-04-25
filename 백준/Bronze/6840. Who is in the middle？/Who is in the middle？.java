import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] inputs = new int[3];
        for (int i = 0; i < 3; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(inputs);
        bw.write(String.valueOf(inputs[1]));
        bw.flush();
        bw.close();
    }
}