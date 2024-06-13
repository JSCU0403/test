class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardArr1 = 0;
        int cardArr1Max = cards1.length;
        int cardArr2 = 0;
        int cardArr2Max = cards2.length;

        for (int i = 0; i < goal.length; i++) {
            String word = goal[i];
            if (cardArr1 < cardArr1Max && word.equals(cards1[cardArr1])) {
                cardArr1++;
            } else if (cardArr2 < cardArr2Max && word.equals(cards2[cardArr2])) {
                cardArr2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}