class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] astr1 = str1.split("");
        String[] astr2 = str2.split("");
        
        for(int i = 0; i < str1.length(); i++){
            answer += astr1[i]+astr2[i];
        }
        return answer;
    }
}