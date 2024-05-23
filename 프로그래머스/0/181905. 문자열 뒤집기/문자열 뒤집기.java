class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s,e+1);
        
        StringBuilder sb = new StringBuilder(answer);
        String reverse = sb.reverse().toString();
        
        my_string = my_string.replaceAll(answer,reverse);
        
        return my_string;
    }
}