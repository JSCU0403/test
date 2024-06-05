class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i = 0; i < answer.length; i++){
            if(i % k != 0){
                answer[i] = answer[i-1];
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < k * picture[i/k].length() ; j++){
                sb.append(picture[i/k].charAt(j / k));
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}