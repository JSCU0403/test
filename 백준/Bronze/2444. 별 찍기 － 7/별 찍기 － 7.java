import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<(2*N);i++){
                if(i<=N){
                    for(int j=0;j<N-i;j++){
                        bw.write(" ");
                    }
                    for(int j=0;j<(2*i)-1;j++){
                        bw.write("*");
                    }
                }else{
                    for(int j=0;j<i-N;j++){
                        bw.write(" ");
                    }
                    for(int j=0;j<(2*N-1)-2*(i-N);j++){
                        bw.write("*");
                    }
                }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
