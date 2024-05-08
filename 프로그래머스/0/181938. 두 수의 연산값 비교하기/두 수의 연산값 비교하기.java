class Solution {
    public int solution(int a, int b) {
        String A = a + "";
        String B = b + "";
        
        if(Integer.parseInt(A+B) < 2*a*b){
            return 2*a*b;
        }
        
        return Integer.parseInt(A+B);
    }
}