class Solution {
    public int solution(int n) {
        int answer = 0;

         for(int i=1; i <= n; i++) {
            String str = i + "";
            if(str.contains("3") || i % 3 == 0) {
                n++;
            }
        }
        
        answer = n;
        
        return answer;
    }
}