class Solution {
    public int differenceOfSum(int[] nums) {

        int sum1 = 0, sum2 = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }

        String s = "";
        for (int i = 0; i < n; i++) {
            s += String.valueOf(nums[i]);
        }
        String[] str = s.split("");

        for (int i = 0; i < s.length(); i++) {
            sum2 += Integer.valueOf(str[i]);
        }

        return Math.abs(sum1 - sum2);

    }
}