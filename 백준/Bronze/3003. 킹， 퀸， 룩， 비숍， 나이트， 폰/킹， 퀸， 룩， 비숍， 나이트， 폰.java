import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] c = {1,1,2,2,2,8};
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<c.length;i++){
            int count = Integer.parseInt(st.nextToken());
            if(c[i] == count){
                bw.write(0+" ");
            }else if(c[i] > count || c[i] < count){
                bw.write(c[i]-count+" ");
            }

        }

        bw.flush();
        br.close();
        bw.close();
    }
}
