class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] replays = {"a", "e", "i", "o", "u"};

        for (String s : replays) {
            if (my_string.contains(s)) {
                answer = my_string.replaceAll(s, "");
                my_string = answer;
            }
        }
        answer = my_string;
        return answer;
    }
}