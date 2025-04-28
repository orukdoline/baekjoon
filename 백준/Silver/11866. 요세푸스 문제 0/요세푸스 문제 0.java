import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer input = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input.nextToken());
        int K = Integer.parseInt(input.nextToken());
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        bw.write("<");
        while (!deque.isEmpty()) {
            for (int i = 1; i < K; i++) {
                deque.addLast(deque.pollFirst());
            }
            int result = deque.pollFirst();
            if (deque.size() == 0) bw.write(String.valueOf(result));
            else bw.write(result + ", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}