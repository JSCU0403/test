import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len = numbers.length;
        
        int[] answer = new int[numbers.length];

        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }
}