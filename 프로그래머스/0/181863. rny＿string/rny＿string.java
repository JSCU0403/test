class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        String[] arr = rny_string.split("");
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("m")){
                answer += "rn";
            }else{
                answer += arr[i];
            }
        }
        
        return answer;
    }
}