class Solution {
 public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }

        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }

        return answer;
    }
}