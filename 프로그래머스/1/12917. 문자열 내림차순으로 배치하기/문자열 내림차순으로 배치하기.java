import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strarr = s.split("");
        Arrays.sort(strarr,Collections.reverseOrder());        
        
        String answer = "";
        
        for(String a : strarr){
            answer += a;
        }
        
        return answer;
    }
}