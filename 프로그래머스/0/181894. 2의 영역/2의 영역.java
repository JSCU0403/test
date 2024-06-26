import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            return new int[]{-1};
        }
        
        int startIndex = list.get(0);
        int endIndex = list.get(list.size()-1);
        int[] answer = Arrays.copyOfRange(arr,startIndex,endIndex+1);
        return answer;
    }
}