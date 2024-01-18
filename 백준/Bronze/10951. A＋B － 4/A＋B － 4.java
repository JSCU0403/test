import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String i = "";

        while((i=br.readLine()) != null && ! i.isEmpty()){
            String[] strs = i.split(" ");
            int A = Integer.parseInt(strs[0]);
            int B = Integer.parseInt(strs[1]);
            bw.write(A+B+"\n");
            bw.flush();
        }
        bw.close();
    }
}
