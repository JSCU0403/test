class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < answer.length; i++){
            String[] num = quiz[i].split(" ");
            int first = Integer.parseInt(num[0]);
            int second = Integer.parseInt(num[2]);
            int result = Integer.parseInt(num[4]);
            String sym = num[1];
            
            if(sym.equals("+")){
                if(first+second == result){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(sym.equals("-")){
                if(first-second == result){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
            
        }
        
        return answer;
    }
}