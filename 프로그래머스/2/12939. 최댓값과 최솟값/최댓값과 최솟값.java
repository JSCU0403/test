class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        
        int min = Integer.parseInt(num[0]);
        int max = Integer.parseInt(num[0]);
        
        for(int i=1;i<num.length;i++){
            if(Integer.parseInt(num[i]) < min){
                min = Integer.parseInt(num[i]);
            }else if(Integer.parseInt(num[i]) > max){
                max = Integer.parseInt(num[i]);
            }
            
        }
        
        String answer = min+" "+max;
        return answer;
    }
}