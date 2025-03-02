import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] input = new String[count];
        for (int i = 0; i < input.length; i++) {
            input[i] = br.readLine();
        }

        int[] total = new int[count];
        for (int i = 0; i < input.length; i++) {
            char[] chars = input[i].toCharArray();

            boolean flag = false;
            int continuous = 1;
            int result = 0;
            for (char c : chars) {
                if (c == 'O') {
                    result += continuous;
                    continuous++;
                } else {
                    continuous = 1;
                }
            }
            total[i] = result;
        }

        for (int n : total) {
            bw.write(n+ "\n");
        }
        bw.flush();
    }
}