import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0;i<N;i++){
            boolean[] arr = new boolean[26];
            String s = br.readLine();
            arr[(int)s.charAt(0)-97] = true;
            for(int j=1; j < s.length() ; j++){
                char c = s.charAt(j);
                if(c == s.charAt(j-1)) continue;

                if(arr[(int)c - 97]){
                    count--;
                    break;
                }
                arr[(int)c - 97] = true;
            }
            count++;
        }

        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
