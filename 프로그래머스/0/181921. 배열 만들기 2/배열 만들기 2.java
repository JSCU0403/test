import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            int cnt = 0;
            String num = Integer.toString(i);
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) == 48 || num.charAt(j) == 53){
                    cnt++;
                }
            }
            if(cnt == num.length()){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}