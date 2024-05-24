class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String str = String.valueOf(k);
        for(int a = i; a <= j; a++){
            String value = String.valueOf(a);
            if (value.contains(str)) {
                String[] array = value.split("");
                
                for (String alpha : array) {
                    if(alpha.equals(str)) answer++;
                }
            }
        }
        
        return answer;
    }
}