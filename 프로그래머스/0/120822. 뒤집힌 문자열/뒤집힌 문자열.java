class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        answer = sb.append(my_string).reverse().toString();
        return answer;
    }
}