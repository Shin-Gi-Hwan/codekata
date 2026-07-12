class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String regx = "[^0-9]";
        String a = my_string.replaceAll(regx, "");
        for (int i = 0; i < a.length(); i++) {
            answer += (a.charAt(i) - 48);
        }
        return answer;
    }
}