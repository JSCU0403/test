import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(X > A[i]){
                System.out.print(A[i] + " ");
            }
        }

        br.close();
    }
}
