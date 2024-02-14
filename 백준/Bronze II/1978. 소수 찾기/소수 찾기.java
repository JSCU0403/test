import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){

            int Z = Integer.parseInt(st.nextToken());

            if(Z == 1) continue;

            for(int j=2;j<=Z;j++){
                if(Z == j){
                    count++;
                }
                if(Z % j == 0){
                    break;
                }
            }
        }

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
