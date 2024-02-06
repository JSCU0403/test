import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 1;
        int range = 2;

        if(N == 1){
            bw.write("1");
        }else{
            while(range <= N){
                range = range + (6*result);
                result++;
            }
            bw.write(result+"");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
