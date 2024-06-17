class Solution {
    public int solution(int n) {
        int answer = 0;
    
        for(int i = 2; i < n+1; i++) {
            if(Prime(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean Prime(int num){
        for(int i = 2; i<= (int) Math.sqrt(num) ; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}