class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0; //0카운트
        int convert = 0; //변환 횟수
        
        String[] arr = s.split("");
        
        while(s.length() > 1){
            int one = 0;
            
            for(int i=0;i<s.length();i++){
              if(s.charAt(i) == '0'){
                  cnt++;
              }  else{
                  one++;    
              }
            }
            
            s = Integer.toBinaryString(one);
            convert++;
        }
        
        answer[1] = cnt;
        answer[0] = convert;
        
        return answer;
    }
}