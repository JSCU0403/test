import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] Ns = new int[N];
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            Ns[i] = Integer.parseInt(st.nextToken());
        }

        int V = Integer.parseInt(br.readLine());

        for(int j=0;j<Ns.length;j++){
            if(V == Ns[j]){
                count++;
            }
        }

        System.out.println(count);

        br.close();


    }
}
