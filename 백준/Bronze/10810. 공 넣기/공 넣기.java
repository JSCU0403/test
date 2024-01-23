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
        for(int i=0;i<M;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken())-1;
            int b = Integer.parseInt(st2.nextToken())-1;
            int c = Integer.parseInt(st2.nextToken());
            for(int j=a;j<=b;j++){
                arr[j] = c;
            }
        }

        for(int z=0;z<N;z++){
                bw.write(arr[z]+" ");
        }
        bw.flush();

        br.close();
    }
}
