import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        String P = br.readLine();
        String[] arr = new String[P.length()];
        for(int i=0;i<P.length();i++){
            arr[i] = String.valueOf(P.charAt(i));
        }

        for(int i=0;i<arr.length/2;i++){
            if(!(arr[i].equals(arr[arr.length-1-i]))){
                count = 0;
            }
        }
        bw.write(count+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
