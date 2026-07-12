class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (char str : my_string.toCharArray()) {
            if (Character.isUpperCase(str)) {
                result.append(Character.toLowerCase(str));
            } else {
                result.append(Character.toUpperCase(str));
            }
        }
        return result.toString();
    }
}