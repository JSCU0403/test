import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        Character[] arr = new Character[N.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = N.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+"");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
