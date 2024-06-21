class Solution {
    public int solution(int n, int m, int[] section) {
        int first = section[0];
        int answer = 1;
        
        for(int item : section){
            if(first + m > item){
                continue;
            }
            
            first = item;
            answer++;
        }
        
        return answer;
    }
}