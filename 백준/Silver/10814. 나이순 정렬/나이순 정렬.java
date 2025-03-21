import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static class Person {
        private final int age;
        private final String name;
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Person[] persons = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Person person = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
            persons[i] = person;
        }

        Arrays.sort(persons, Comparator.comparingInt(Person::getAge));

        for (int i = 0; i < N; i++) {
            bw.write(persons[i].getAge() + " " + persons[i].getName() + "\n");
        }
        bw.flush();
        bw.close();
    }
}