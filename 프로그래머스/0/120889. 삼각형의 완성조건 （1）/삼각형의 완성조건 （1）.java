class Solution {
    public int solution(int[] n) {
        int answer = 0;
        int max = 0;
        int result = 0;
        for (int i : n) {
            if (i > max) {
                max = i;
            }
            result += i;
        }
        if ((result - max) > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        return answer;
    }
}