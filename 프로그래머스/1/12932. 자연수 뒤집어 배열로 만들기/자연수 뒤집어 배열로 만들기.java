class Solution {
    public int[] solution(long n) {
        String s = n + "";
        
        int[] answer = new int[s.length()];
        
        for(int i = 0;i<s.length();i++){
            answer[i] = Integer.parseInt(s.charAt(s.length()-1-i)+"");
        }
        
        return answer;
    }
}