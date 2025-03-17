import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            String value = br.readLine();
            if (i == 0) {
                input[i] = value;
            }
            else{
                boolean temp = false;
                for (int j = 0; j < i; j++) {
                    if (value.equals(input[j])) {
                        temp = true;
                        break;
                    }
                }
                if (temp == false) input[i] = value;
            }
        }

        Arrays.sort(input, Comparator.nullsFirst(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())));

        for (int i = 0; i < N; i++) {
            if (input[i] == null) continue;
            bw.write(input[i] + "\n");
        }
        bw.flush();
    }
}