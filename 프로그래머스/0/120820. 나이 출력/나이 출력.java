class Solution {
    public int solution(int age) {
        int answer = 0;
        if (0 < age && 120 >= age) {
            int year = 2022;
            answer = year - age + 1;
        }
        return answer;
    }
}