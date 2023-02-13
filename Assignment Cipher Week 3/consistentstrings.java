class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int arr[] = new int[26];
        int ans = 0, res = 0;
        String word;

        for (int i = 0; i < allowed.length(); i++) {
            arr[(allowed.charAt(i) - 'a')]++;
        }

        for (int i = 0; i < words.length; i++) {
            ans = 0;
            for (int j = 0; j < words[i].length(); j++) {
                ans = 1;
                if (arr[(words[i].charAt(j) - 'a')] == 0) {
                    ans = 0;
                    break;
                }
            }
            res += ans;
        }
        return res;
    }
}