import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        int max = -1;
        char e = ' ';
        int[] arr = new int[26];

        for(int i=0;i<A.length();i++){
            if('A' <=A.charAt(i) && A.charAt(i)<= 'Z'){
                arr[A.charAt(i) - 'A']++;
            }
            else{
                arr[A.charAt(i) - 'a']++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                e = (char) (i + 65);
            }
            else if(arr[i] == max){
                e = '?';
            }
        }
        bw.write(e);

        bw.flush();
        br.close();
        bw.close();
    }
}
