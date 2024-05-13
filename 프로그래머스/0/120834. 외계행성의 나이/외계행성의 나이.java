class Solution {
    public String solution(int age) {
        String temp = ""+ age;
        String answer = "";
        
        for(int i=0; i<temp.length(); i++) {            
                answer += (char)(temp.charAt(i)+49);
            }
        return answer;
    }
}