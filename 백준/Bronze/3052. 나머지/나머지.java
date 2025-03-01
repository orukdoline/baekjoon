import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = new int[10];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(br.readLine()) % 42;
        }

        int count = 0;
        List<Integer> values = new ArrayList<>();
        values.add(input[0]);
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < values.size(); j++) {
                if (input[i] != values.get(j)) count++;
                if (count == values.size()) values.add(input[i]);
            }
            count = 0;
        }
        bw.write(values.size() + "\n");
        bw.flush();
    }
}