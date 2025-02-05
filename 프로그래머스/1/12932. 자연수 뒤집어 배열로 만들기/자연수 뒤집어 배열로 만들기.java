class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - 48;

        }
        for (int i = answer.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = arr[i];
        }
        return answer;
    }
}