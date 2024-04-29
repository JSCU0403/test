class Solution {
    public int solution(String myString, String pat) {
        String lmyString = myString.toLowerCase();
        String lpat = pat.toLowerCase();
        
       if(lmyString.contains(lpat)){
           return 1;
       }else{
           return 0;
       }
    }
}