class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_count = Integer.bitCount(n);
        int b_count = 0;
            
        while(true){
            n++;
            b_count = Integer.bitCount(n);
            if(n_count == b_count){
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}