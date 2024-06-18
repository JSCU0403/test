import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[31];
        
        for(int i = 0 ; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }
        
        for(int j = 0; j <= 30; j++){
            answer = Math.max(answer,count[j]);
        }
        
        return answer;
    }
}