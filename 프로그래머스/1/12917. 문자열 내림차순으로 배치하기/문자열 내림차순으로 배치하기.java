import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }
        list.sort(Collections.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            answer.append(list.get(i));
        }
        return answer.toString();
    }
}