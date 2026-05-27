class Solution {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '*') {
                stack.setLength(stack.length() - 1);
            }
            else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}