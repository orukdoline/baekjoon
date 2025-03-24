import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static class Position {
        private final int x;
        private final int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Position[] positions = new Position[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Position person = new Position(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            positions[i] = person;
        }

        Arrays.sort(positions, Comparator.comparingInt(Position::getY).thenComparingInt(Position::getX));

        for (int i = 0; i < N; i++) {
            bw.write(positions[i].getX() + " " + positions[i].getY() + "\n");
        }
        bw.flush();
        bw.close();
    }
}