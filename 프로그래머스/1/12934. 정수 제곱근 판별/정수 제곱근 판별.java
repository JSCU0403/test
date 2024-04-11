class Solution {
    public long solution(long n) {
        long answer = 0;
        
        Double i = Math.sqrt(n);
        
        if(i == i.intValue()){
            answer = (long)Math.pow(i+1,2);
        }else{
            answer = -1;
        }
        
        return answer;
    }
}