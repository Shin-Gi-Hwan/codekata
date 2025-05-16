class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            answer = answer + c - '0';
        }
        return answer;
    }
}