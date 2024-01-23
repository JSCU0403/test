import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[] arr = new int[N];
        for(int n=1;n<=N;n++){
            arr[n-1] = n;
        }
        for(int i=0;i<M;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken())-1;
            int b = Integer.parseInt(st2.nextToken())-1;
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
        }

        for(int z=0;z<N;z++){
                bw.write(arr[z]+" ");
        }
        bw.flush();

        br.close();
    }
}
