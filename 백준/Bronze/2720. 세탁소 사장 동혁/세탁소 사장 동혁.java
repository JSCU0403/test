import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int C = Integer.parseInt(br.readLine());
            int quarter = 25;
            int dime = 10;
            int nickel = 5;
            int penny = 1;
            bw.write(C/quarter+" "+(C%quarter)/dime+" "+((C%quarter)%dime)/nickel+" "+(((C%quarter)%dime)%nickel)/penny);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
