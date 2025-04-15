import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append("     /~\\\n");
        sb.append("    ( oo|\n");
        sb.append("    _\\=/_\n");
        sb.append("   /  _  \\\n");
        sb.append("  //|/.\\|\\\\\n");
        sb.append(" ||  \\ /  ||\n");
        sb.append("============\n");
        sb.append("|          |\n");
        sb.append("|          |\n");
        sb.append("|          |\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}