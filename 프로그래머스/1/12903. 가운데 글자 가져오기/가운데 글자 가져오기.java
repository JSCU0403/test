class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if(s.length()%2 == 0){
            answer += s.substring((len/2)-1,len/2+1);
        }
        
        if(s.length()%2 == 1){
            answer += s.substring(len/2,len/2+1);
        }
        
        return answer;
    }
}