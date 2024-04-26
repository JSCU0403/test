import java.util.*;


class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        
        int num = st.countTokens();
        
        String[] answer = new String[num];
        
         for (int i = 0; i < num; i++) {
            answer[i] = st.nextToken();
        }
        
        
        return answer;
    }
}