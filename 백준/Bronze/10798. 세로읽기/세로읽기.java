import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] input = new String[5][15];

        for(int i=0;i<5;i++){
            String row = br.readLine();
            for(int j=0;j<row.length();j++){
                input[i][j] = String.valueOf(row.charAt(j));
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(input[j][i] != null){
                    bw.write(input[j][i]+"");
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
