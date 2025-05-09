import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());

        BigInteger klaudia = total.add(diff).divide(BigInteger.valueOf(2));
        BigInteger natalia = total.subtract(diff).divide(BigInteger.valueOf(2));

        bw.write(klaudia + "\n" + natalia);
        bw.flush();
        br.close();
    }
}