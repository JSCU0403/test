import java.util.*;

class Solution {
    public List<String> solution(String myStr) {
        String[] arr = myStr.split("a|b|c");
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        List<String> answer = new ArrayList<>();
        
        for(String str : list) {
            if(!str.isEmpty()) answer.add(str);
        }
        
        if(answer.isEmpty()) answer.add("EMPTY");
        
        return answer;
    }
}