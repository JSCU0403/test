class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i = 1; i < answer.length; i++){
            char ch1 = s.charAt(i);
            for(int j = i-1; j >= 0; j--){
                char ch2 = s.charAt(j);
                if(ch1 == ch2){
                    answer[i] = i-j;
                    break;
                }
                if(j == 0){
                    answer[i] = -1;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}