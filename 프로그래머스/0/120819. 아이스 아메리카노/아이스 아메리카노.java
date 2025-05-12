class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int number = money / 5500;
        answer[0] = number;
        answer[1] = money - (number * 5500);
        return answer;
    }
}