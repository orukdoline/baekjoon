import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new LinkedList<Integer>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) queue.offer(Integer.parseInt(st.nextToken()));
            else if (command.equals("pop")) {
                if (queue.isEmpty()) bw.write("-1\n");
                else {
                    bw.write(queue.peek() + "\n");
                    queue.poll();
                }
            }
            else if (command.equals("size")) bw.write(queue.size() + "\n");
            else if (command.equals("empty")) {
                if (queue.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (command.equals("front")) {
                if (queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.peek() + "\n");
            }
            else if (command.equals("back")) {
                if (queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.peekLast() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}