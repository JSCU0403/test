import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int MAX = -1;
        int r = 0;
        int c = 0;

        int[][] A = new int[9][9];

        for(int i=0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(MAX < A[i][j]){
                    MAX = A[i][j];
                    r = i+1;
                    c = j+1;
                }
            }
        }

        bw.write(MAX+"\n"+r+" "+c);

        bw.flush();
        br.close();
        bw.close();
    }
}
