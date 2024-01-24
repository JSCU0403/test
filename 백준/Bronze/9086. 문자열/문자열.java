import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String S = br.readLine();
            String[] arr = S.split("");
            bw.write(arr[0]+arr[arr.length-1]+"\n");
        }

        bw.flush();
        br.close();
    }
}
