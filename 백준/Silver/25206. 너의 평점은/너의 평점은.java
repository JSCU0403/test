import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0;
        int point = 0;

        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble((st.nextToken()));
            String grade = st.nextToken();
            point += credit;
            switch (grade){
                case "A+" :
                    sum += credit*4.5;
                    break;
                case "A0" :
                    sum += credit*4.0;
                    break;
                case "B+" :
                    sum += credit*3.5;
                    break;
                case "B0" :
                    sum += credit*3.0;
                    break;
                case "C+" :
                    sum += credit*2.5;
                    break;
                case "C0" :
                    sum += credit*2.0;
                    break;
                case "D+" :
                    sum += credit*1.5;
                    break;
                case "D0" :
                    sum += credit*1.0;
                    break;
                case "F" :
                    sum += credit*0;
                    break;
                case "P" :
                    point -= credit;
                    break;

            }

        }
        bw.write(String.format("%.6f",sum/point));

        bw.flush();
        br.close();
        bw.close();
    }
}
