import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int order = 0;
        for(int i=1;i<=9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>max){
                max = num;
                order = i;
            }
        }
        bw.write(max+"\n"+order);
        bw.flush();

        br.close();
    }
}
