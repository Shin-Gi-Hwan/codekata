class Solution {
    public int solution(float num1, float num2) {
        int answer = 0;
        if ((0 < num1 && 100 >= num1) &&
            (0 < num2 && 100 >= num2)) {
            
           float result = (num1 / num2) * 1000.0f;
            answer = (int) result;
        }
        return answer;
    }
}