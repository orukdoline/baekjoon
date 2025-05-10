import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Character[] words = new Character[input.length()];
        for (int i = 0; i < input.length(); i++) {
            words[i] = input.charAt(i);
        }

        Arrays.sort(words, Comparator.reverseOrder());

        for (int i = 0; i < words.length; i++) {
            bw.write(words[i]);
        }
        
        bw.flush();
        br.close();
    }
}