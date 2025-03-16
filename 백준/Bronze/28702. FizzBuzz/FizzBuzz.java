import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 3; i > 0; i--){
            String input = br.readLine();
            if(input.matches("-?\\d+(\\.\\d+)?")){
                int value = Integer.parseInt(input) + i;
                if(value % 3 == 0){
                    if (value % 5 == 0) {
                        bw.write("FizzBuzz");
                    }else {
                        bw.write("Fizz");
                    }
                } else if (value % 5 == 0) {
                    bw.write("Buzz");
                }else {
                    bw.write(value + "\n");
                }
                bw.flush();
                return;
            }
        }
    }
}