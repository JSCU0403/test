import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String Z = "";
        while((Z=br.readLine()) != null){
            bw.write(Z + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
