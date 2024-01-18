import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(;;){
            String[] strs = br.readLine().split(" ");
            int A = Integer.parseInt(strs[0]);
            int B = Integer.parseInt(strs[1]);
            if(A == 0 && B == 0){
                break;
            }
            bw.write(A+B+"\n");
            bw.flush();
        }
        bw.close();
    }
}
