import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=1;i<=T;i++){
            for(int j=T;j>0;j--){
                if(j>i){
                    bw.write(" ");
                }else{
                    bw.write("*");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
