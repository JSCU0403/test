import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        char[] a = new char[36];

        for(int i=0;i<10;i++){
            a[i] = (char)(i+'0');
        }
        for(int i=10;i<36;i++){
            a[i] = (char)(i+'A'-10);
        }

        int result = 0;
        String ten = "";

        while(N>0){
            result = N%B;
            N=N/B;
            ten=a[(int)result]+ten;
        }

        bw.write(ten+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
