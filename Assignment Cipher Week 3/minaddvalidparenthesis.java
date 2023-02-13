class Solution {
    public int minAddToMakeValid(String s) {

        int i = 0, ans = 0;

        Stack<Character> st = new Stack();

        while (i < s.length()) {

            if (!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
                i++;
            }

            else {
                st.push(s.charAt(i));
                i++;
            }

        }
        return st.size();

    }
}