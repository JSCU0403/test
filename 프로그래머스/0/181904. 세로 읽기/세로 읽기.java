class Solution {
    public String solution(String my_string, int m, int c) {
        String[] arr = my_string.split("");
        String answer = "";
        
        for(int i = 0; i < arr.length; i++){
            if(i % m == c-1){
                answer += arr[i];
            }
        }
        
        return answer;
    }
}