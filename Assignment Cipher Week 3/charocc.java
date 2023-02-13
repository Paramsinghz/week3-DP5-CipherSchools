class Solution {
    public boolean areOccurrencesEqual(String s) {

        int arr[] = new int[26];
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                sum = arr[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0 && sum != arr[i]) {
                return false;
            }
        }
        return true;

    }
}