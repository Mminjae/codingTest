class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0; // 올바른 괄호면 true, 아니면 false
    }
}