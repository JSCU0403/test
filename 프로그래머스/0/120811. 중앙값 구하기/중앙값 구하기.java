import java.util.*;

class Solution {
    public int solution(int[] array) {
        int arr = (array.length/2);
        
        Arrays.sort(array);
        
        int answer = array[arr];
        
        return answer;
    }
}