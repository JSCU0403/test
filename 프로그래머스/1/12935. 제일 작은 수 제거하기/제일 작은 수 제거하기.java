class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        int min = arr[0];
        
        int[] answer = new int[arr.length-1];
        
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        
        int cnt = 0;
        
        for(int j=0;j<arr.length;j++){
            if(arr[j] == min){
                continue;
            }
            answer[cnt++] = arr[j];
        }
        
        return answer;
    }
}