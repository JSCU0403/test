class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 4;
        
        while(num <= n){
            int cnt = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    cnt++;
                }
            }
            
            if(cnt >= 3) answer++;
            num++;
        }
        return answer;
    }
}