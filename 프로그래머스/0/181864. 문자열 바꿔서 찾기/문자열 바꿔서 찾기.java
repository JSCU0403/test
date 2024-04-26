class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String replacedString = myString.replace('A', 'Z').replace('B', 'A').replace('Z', 'B');
        
        if (replacedString.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}