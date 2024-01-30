import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String c = br.readLine();
        for(int i=0;i<c.length();i++){
            if(c.charAt(i) == 'c'){
                if(i < c.length()-1){
                    if(c.charAt(i+1) == '=' || c.charAt(i+1) == '-'){
                        i++;
                    }
                }
            }else if(c.charAt(i) == 'd'){
                if(i < c.length()-1) {
                    if (c.charAt(i + 1) == 'z') {
                        if(i < c.length() - 2) {
                            if(c.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (c.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }else if(c.charAt(i) == 'l'){
                if(i < c.length()-1) {
                    if (c.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if(c.charAt(i) == 'n'){
                if(i < c.length()-1) {
                    if (c.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if(c.charAt(i) == 's'){
                if(i < c.length()-1) {
                    if (c.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }else if(c.charAt(i) == 'z'){
                if(i < c.length()-1) {
                    if (c.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
                count++;

        }

        bw.write(count+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
