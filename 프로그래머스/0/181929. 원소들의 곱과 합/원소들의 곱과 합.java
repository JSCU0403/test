

class Solution {
    public int solution(int[] num_list) {
        int m = num_list[0];
        int sum = num_list[0];
        
        for(int i = 1; i < num_list.length ; i++){
            m *= num_list[i];
            sum += num_list[i];
        }
        
        if(m < Math.pow(sum,2)){
            return 1;
        }else{
            return 0;
        }
        
    }
}