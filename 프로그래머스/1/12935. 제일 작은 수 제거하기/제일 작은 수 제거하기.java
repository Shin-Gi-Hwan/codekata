class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int min = arr[0];
        int[] answer = new int[arr.length - 1];

        for (int k : arr) {
            min = Math.min(min, k);
        }

        int idx = 0;

        for (int j : arr) {
            if (min == j) {
                continue;
            } else {
                answer[idx++] = j;
            }
        }
        return answer;
    }
}