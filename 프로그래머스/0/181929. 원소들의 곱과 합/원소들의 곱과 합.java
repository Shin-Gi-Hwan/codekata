class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int addResult = 0;
        int mulResult = 1;
        for (int i = 0; i < num_list.length; i++) {
            addResult += num_list[i];
            mulResult *= num_list[i];
        }
        
        if ((addResult * addResult) > mulResult) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}