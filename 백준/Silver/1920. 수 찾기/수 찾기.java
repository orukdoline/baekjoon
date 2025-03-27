import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] input1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] input2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            input2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input1);
        for (int i = 0; i < input2.length; i++) {
            boolean flag = false;
            int left = 0;
            int right = input1.length - 1;
            while(left <= right){
                int mid = (left + right) / 2;
                if(input2[i] == input1[mid]){
                    flag = true;
                    break;
                }
                else if(input2[i] < input1[mid]){
                    right = mid - 1;
                }
                else left = mid + 1;
            }
            if (flag) sb.append("1\n");
            else sb.append("0\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}