import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        
        StringTokenizer st = new StringTokenizer(s);
        
        while(st.hasMoreTokens()){
            String z = st.nextToken();
            if(!z.equals("Z")){
                answer += Integer.parseInt(z);
                num = Integer.parseInt(z);
            }else{
                answer -= num;
            }
            
        }
        
        return answer;
    }
}