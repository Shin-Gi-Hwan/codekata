/**
    해당 문제는 서브스트링을 쓰면 좋을 꺼 같다.
*/

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s)
            + overwrite_string
            + my_string.substring(s + overwrite_string.length());
    }
}