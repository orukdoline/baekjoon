import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer cardsSt = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(cardsSt.nextToken());
        }
        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer findSt = new StringTokenizer(br.readLine());
        int[] finds = new int[M];
        for (int i = 0; i < M; i++) {
            finds[i] = Integer.parseInt(findSt.nextToken());
        }

        for (int i = 0; i < M; i++) {
            bw.write(upperBound(cards, finds[i]) - lowerBound(cards, finds[i]) + " ");
        }
        bw.flush();
        bw.close();
    }

    public static int upperBound(int[] array, int key) {
        int left = 0, right = array.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (key < array[mid]) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static int lowerBound(int[] array, int key) {
        int left = 0, right = array.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (key <= array[mid]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}