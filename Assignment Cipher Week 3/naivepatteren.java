package Strings;

public class naivepatteren {

    static void patteren(String str, String patt) {

        for (int i = 0; i <= str.length() - patt.length(); i++) {
            int j;
            for (j = 0; j < patt.length(); j++) {

                if (str.charAt(i + j) != patt.charAt(j)) {
                    break;
                }
                if (j == patt.length() - 1) {
                    System.out.println(i);

                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcabcd";
        String patt = "abcd";
        patteren(str, patt);

    }
}