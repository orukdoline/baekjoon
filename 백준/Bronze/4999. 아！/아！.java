import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String me = br.readLine();
        String doctor = br.readLine();
        if (me.length() >= doctor.length()) bw.write("go");
        else bw.write("no");
        bw.flush();
        bw.close();
    }
}