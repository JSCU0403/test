import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[5];
        int average = 0;

        for(int i=0;i<5;i++){
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
            average += number;
        }
        Arrays.sort(numbers);

        bw.write(average/5+"\n");
        bw.write(numbers[2]+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
