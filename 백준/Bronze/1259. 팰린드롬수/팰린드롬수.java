import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> inputs = new ArrayList<>();
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;
            else inputs.add(input);
        }

        for (String input : inputs) {
            char[] chars = input.toCharArray();
            int middle = chars.length / 2 + 1;
            if (chars.length % 2 == 0) middle--;
            boolean result = true;
            for (int i = 0; i < middle; i++) {
                if (chars[i] != chars[chars.length - 1 - i]) {
                    result = false;
                    break;
                }
            }
            if (result == true) bw.write("yes\n");
            else bw.write("no\n");
            bw.flush();
        }
    }
}