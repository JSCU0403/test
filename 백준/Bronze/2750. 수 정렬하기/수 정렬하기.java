import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            int A = Integer.parseInt(br.readLine());
            arr[i] = A;
        }

        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<N;i++){
            bw.write(arr[i]+"");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
