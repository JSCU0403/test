import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr,Collections.reverseOrder());
        
        String s = "";
        
        for(int i=0;i<arr.length;i++){
            s += arr[i];
        }
        
        long answer = Long.parseLong(s);
        
        return answer;
    }
}