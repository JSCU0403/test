import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = new int[3];
        int[] y = new int[3];

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int result_x = 0;
        int result_y = 0;

        if(x[0] == x[1]){
            result_x = x[2];
        }else if(x[0] == x[2]){
            result_x = x[1];
        }else{
            result_x = x[0];
        }
        if(y[0] == y[1]){
            result_y = y[2];
        }else if(y[0] == y[2]){
            result_y = y[1];
        }else{
            result_y = y[0];
        }

        bw.write(result_x+" "+result_y);
        bw.flush();
        br.close();
        bw.close();
    }
}
