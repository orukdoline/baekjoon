import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("  ___  ___  ___\n");
        bw.write("  | |__| |__| |\n");
        bw.write("  |           |\n");
        bw.write("   \\_________/\n");
        bw.write("    \\_______/\n");
        bw.write("     |     |\n");
        bw.write("     |     |\n");
        bw.write("     |     |\n");
        bw.write("     |     |\n");
        bw.write("     |_____|\n");
        bw.write("  __/       \\__\n");
        bw.write(" /             \\\n");
        bw.write("/_______________\\\n");
        bw.flush();
        bw.close();
    }
}