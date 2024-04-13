class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;
        
        while(num2 > 1){
            if(answer == 500){
              return -1;
            }else if(num2 == 1){
                break;
            }
            
            if(num2 % 2 == 0){
                num2 /= 2;
            }else{
                num2 = (num2 * 3) + 1;
            }
            answer++;
        }

        return answer;
    }
}