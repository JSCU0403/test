class Solution {
    public int[] solution(int n) {
        int a = 0;
        int odd = 1;
        
        if(n % 2 == 0){
            a = n/2 ;
        }else if(n % 2 != 0){
            a = (n/2)+1;
        }
        
        int[] answer = new int[a];
        
        for(int i = 0; i < a ; i++){
            answer[i] = odd;
            odd += 2;
        }
        
        return answer;
    }
}