import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringTokenizer st = new StringTokenizer(s," ",true);
        
        while(st.hasMoreTokens()){
            String str = st.nextToken();
        	if(str.equals(" ")) {
        		answer += str;
        		continue;
        	}
        	for(int i=0; i<str.length(); i++) {
        		if(i%2==0) {
        			answer += Character.toUpperCase(str.charAt(i));
        		}else {
        			answer += Character.toLowerCase(str.charAt(i));
        		}
        	}
        }
        
        
        return answer;
    }
}