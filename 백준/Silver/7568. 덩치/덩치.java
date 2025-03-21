import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        class Person {
            private final int height;
            private final int weight;
            public Person(int height, int weight) {
                this.height = height;
                this.weight = weight;
            }
            public int getHeight() {
                return height;
            }
            public int getWeight() {
                return weight;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Person[] persons = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Person person = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            persons[i] = person;
        }

        int[] rank = new int[N];
        int result = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (persons[i].getHeight() < persons[j].getHeight() && persons[i].getWeight() < persons[j].getWeight()) {
                    result++;
                }
            }
            rank[i] = result;
            result = 1;
        }

        for (int i = 0; i < N; i++) {
            bw.write(rank[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}