class Solution {
    public int solution(int a, int b) {
        String A = a+"";
        String B = b+"";
        
        if(Integer.parseInt(A+B) < Integer.parseInt(B+A)){
            return Integer.parseInt(B+A);
        }
        
        return Integer.parseInt(A+B);
    }
}