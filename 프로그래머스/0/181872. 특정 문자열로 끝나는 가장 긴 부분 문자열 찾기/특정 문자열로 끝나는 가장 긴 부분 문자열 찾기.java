class Solution {
    public String solution(String myString, String pat) {
        int num = myString.lastIndexOf(pat);
        String answer = myString.substring(0,num+pat.length());
        return answer;
    }
}