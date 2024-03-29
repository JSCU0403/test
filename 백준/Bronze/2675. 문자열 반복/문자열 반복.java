import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());

            String S = st.nextToken();
            String[] arr = S.split("");

            for(int j=0;j<arr.length;j++){
                for(int z=0;z<R;z++){
                    bw.write(arr[j]);
                }
            }
            bw.newLine();
        }


        bw.flush();
        br.close();
    }
}
