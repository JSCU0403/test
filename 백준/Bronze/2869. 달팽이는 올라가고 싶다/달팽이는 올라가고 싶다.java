import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int count = (V-A) / (A-B); //정상까지 오르기 직전 날짜
        
        if((V-A) % (A-B) != 0){ //정상높이보다 오른 길이가 짧을때
            count ++; //날짜 추가
        }
        
        bw.write(count+1+""); //마지막에 오른날 1일 더하기
        bw.flush();
        br.close();
        bw.close();
    }
}
