class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num += (str.charAt(i) - 48);
        }
        
        if (x % num != 0) {
            answer = false;
        }
        
        return answer;
    }
}