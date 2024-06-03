import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList();
        
        int i = 0;
        
        while (i < arr.length) { // i가 arr의 길이보다 작은 동안
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else {
                int last = stk.get(stk.size() - 1);
                if (last < arr[i]) { 
                    stk.add(arr[i]);
                    i++; 
                }  else {
                    stk.remove(stk.size() - 1);
                }
            }
        }
        
        return stk.stream().mapToInt(z -> z).toArray();
     }
}