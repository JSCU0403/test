import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] ranking = new int[rank.length];
        int count = 0;
        int answer = 0;
       
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                ranking[i] = rank[i];
            }else{
                rank[i] = Integer.MAX_VALUE;
            }
        }
        
        Arrays.sort(rank);
        
        for (int i = 0; i < ranking.length; i++) {
			if (rank[0] == ranking[i]) {
				answer += i * 10000;
			} else if (rank[1] == ranking[i]) {
				answer += i*100;
			} else if (rank[2] == ranking[i]) {
				answer += i;
			}
		}
        
        return answer;
    }
}