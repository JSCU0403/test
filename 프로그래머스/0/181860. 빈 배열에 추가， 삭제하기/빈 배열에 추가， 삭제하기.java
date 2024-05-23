import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0 ; j < arr[i]*2 ; j++){
                    list.add(arr[i]);
                }
            }else{
                int num = arr[i];
                int size = list.size();
                if (size >= num) {
                    for (int j = 0; j < num; j++) {
                        list.remove(size - 1 - j);
                    }
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int z = 0; z < list.size(); z++) {
            answer[z] = list.get(z);
        }

        return answer;
    }
}