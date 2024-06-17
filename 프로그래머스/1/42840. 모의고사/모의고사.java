import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int one = 0;
        int two = 0;
        int three = 0;
        
        for(int i = 0; i < answers.length; i++){
            if (answers[i] == arr1[i % arr1.length]) one++;
            if (answers[i] == arr2[i % arr2.length]) two++;
            if (answers[i] == arr3[i % arr3.length]) three++;
        }
        
        int max = Math.max(one,Math.max(two,three));
        
        if(max == one) list.add(1);
        if(max == two) list.add(2);
        if(max == three) list.add(3);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}