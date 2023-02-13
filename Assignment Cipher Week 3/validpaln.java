class Solution {
    public boolean isPalindrome(String s) {

        String str = "";
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                str += s.charAt(i);
            }
        }
        System.out.println(str);

        // if(str.length() == 1 || str.length() == 0) return true;

        return check(str, 0, str.length() - 1);

    }

    public static boolean check(String str, int left, int right) {

        if (left >= right) {
            return true;
        }

        return (str.charAt(left) == str.charAt(right)) &&
                check(str, left + 1, right - 1);

    }
}