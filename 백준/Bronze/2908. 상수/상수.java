import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String[] AR = A.split("");
        String sum1 = "";
        for(int i=AR.length-1;i>=0;i--){
            sum1 += AR[i]+"";
        }
        String B = st.nextToken();
        String[] BR = B.split("");
        String sum2 = "";
        for(int i=BR.length-1;i>=0;i--){
            sum2 += BR[i]+"";
        }
        if(Integer.parseInt(sum1)>Integer.parseInt(sum2)){
            bw.write(sum1+"");
        }else{
            bw.write(sum2+"");
        }

        bw.flush();
        br.close();
    }
}
