import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) stack.push(Integer.parseInt(st.nextToken()));
            else if (command.equals("pop")) {
                if (stack.isEmpty()) bw.write("-1\n");
                else {
                    bw.write(stack.peek() + "\n");
                    stack.pop();
                }
            }
            else if (command.equals("size")) bw.write(stack.size() + "\n");
            else if (command.equals("empty")) {
                if (stack.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }
            else if (command.equals("top")) {
                if (stack.isEmpty()) bw.write("-1\n");
                else bw.write(stack.peek() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}