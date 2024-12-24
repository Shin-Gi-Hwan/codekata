class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if ((0 < num1 && 100 >= num1) &&
            (0 < num2 && 100 >= num2)) {
            
            double result = ((double) num1 / (double) num2) * 1000.0;
            answer = (int) result;
        }
        return answer;
    }
}