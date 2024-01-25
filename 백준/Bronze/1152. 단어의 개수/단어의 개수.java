import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String[] arr = S.split(" ");
        List<String> strList = new ArrayList<>(Arrays.asList(arr));
        strList.remove("");

        bw.write(strList.size()+"");
        bw.newLine();

        bw.flush();
        br.close();
    }
}
