class Solution {
    public int[] solution(int[] arr, int n) {
        int num = arr.length;
        
        int[] answer = new int[num];
        
        if(num % 2 == 0){
            for(int i = 0; i < num ; i ++){
                if(i % 2 != 0){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
               
            }
        }else if(num % 2 != 0){
            for(int i = 0; i < num ; i ++){
                if(i % 2 == 0){
                    answer[i] = arr[i] + n;
                }else{
                    answer[i] = arr[i];
                }
               
            }
        }
        
        
        return answer;
    }
}