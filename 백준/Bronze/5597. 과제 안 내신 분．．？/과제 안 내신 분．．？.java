import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[30];
        for(int i=1;i<=28;i++){
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = true;
        }

        for(int i=1;i<=30;i++){
            if(!arr[i-1]){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        br.close();
    }
}
