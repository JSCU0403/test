class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int max = 1000001;
        int[] answer = new int[queries.length];
        int idx = 0;

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            int result = max;
            for (int i = s; i <= e; i++) {
                if (arr[i] <= k || arr[i] >= result) continue;

                result = arr[i];
            }

            answer[idx++] = result == max ? -1 : result;
        }

        return answer;
    }
}