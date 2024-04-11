import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int num = Arrays.asList(seoul).indexOf("Kim");
        
        String answer = "김서방은 "+ num +"에 있다";
        return answer;
    }
}