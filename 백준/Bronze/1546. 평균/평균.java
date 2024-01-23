import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double M = 0;
        int sum = 0;
        double newsum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if(arr[i]>M){
                M = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            newsum += ((arr[i]/M)*100);
        }
        bw.write( String.format("%.6f", newsum/N)+" ");

        bw.flush();
        br.close();
    }
}
