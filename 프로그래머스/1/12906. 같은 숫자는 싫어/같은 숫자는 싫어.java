import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        int temp = -1;
        for(int i=0;i<arr.length;i++){
            if(temp == arr[i]){
                continue;
            }
            temp = arr[i];
            list.add(temp);
        }    
        
        int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}