import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] paper = new int[100][100];
        int number = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i=0;i<number;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for(int j=N;j<N+10;j++){
                for(int k=B;k<B+10;k++){
                    if(paper[j][k] != 1){
                        total += 1;
                    }
                    paper[j][k] = 1;
                }
            }
        }

        bw.write(total+"");


        bw.flush();
        br.close();
        bw.close();
    }
}
