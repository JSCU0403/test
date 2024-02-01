import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        String B = st.nextToken();

        int sum = 0;

        for(int i=0;i<N.length();i++){
            char c = N.charAt(i);
            int tmp;
            if(c >= 'A'){
                tmp = (int)c - 'A' + 10;
            } else {
                tmp = c - '0';
            }
            tmp *= Math.pow(Integer.parseInt(B),N.length()-i-1);
            sum += tmp;
        }

        bw.write(sum+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
