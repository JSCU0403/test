import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int dig = String.valueOf(n).length(); //자리수
        
        for(int i=1;i<=dig;i++){
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}