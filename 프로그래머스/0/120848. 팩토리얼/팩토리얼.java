class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;
        
        for(int i = 2; i <= 10; i++){
            result *= i;
            if(result > n){
                answer = i-1;
                break;
            }else if(result == n){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}