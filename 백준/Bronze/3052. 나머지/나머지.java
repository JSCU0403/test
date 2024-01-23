import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> arr = new HashSet<Integer>();

        for(int i=0;i<10;i++){
            arr.add(Integer.parseInt(br.readLine())%42);
        }

        bw.write(arr.size()+"");

        bw.flush();
        br.close();
    }
}
