class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int num = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > max) {
                max = array[i];
                num = i;
            }
        }
            
        int[] answer = {max,num};
        
        return answer;
    }
}