class Solution {
       public int solution(int num) {
        int answer = 0;
        while (true) {
            if (num == 1) {
                break;
            } else if (num < 0) {
                answer = -1;
                break;
            } else if (num % 2 == 0) {
                answer++;
                num = num / 2;
            } else if (num % 2 == 1) {
                answer++;
                num = (num * 3) + 1;
            }
        }
        return answer;
    }
}