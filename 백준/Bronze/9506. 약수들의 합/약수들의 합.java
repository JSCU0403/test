import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int n = Integer.parseInt(br.readLine());

            if(n == -1){
                break;
            }

            ArrayList<Integer> list = new ArrayList<>();

            int sum = 0;

            for(int i=1;i<n;i++){
                if(n % i == 0){
                   list.add(i);
                   sum += i;
                }
            }

            if(n == sum) {
                bw.write(n + " = ");
                for (int i = 0; i < list.size()-1; i++){
                    bw.write(list.get(i) + " + ");
                }
                bw.write(list.get(list.size()-1)+"");
            }
            else{
                bw.write(n + " is NOT perfect.");
            }
            bw.write("\n");


        }

        bw.flush();
        br.close();
        bw.close();
    }
}
