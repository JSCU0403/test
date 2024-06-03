import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        
        int i = 0;
        
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                int last = stk.get(stk.size() -1);
                if(last == arr[i]){
                    stk.remove(stk.size() -1);
                    i++;
                }else if(last != arr[i]){
                    stk.add(arr[i]);
                    i++;
                }
            }
        }
        
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        
        return stk.stream().mapToInt(j -> j).toArray();
    }
}