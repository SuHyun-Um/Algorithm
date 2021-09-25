package LeetCode.Easy;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        /**
         * Example 1:
         * Input: [2,2,1]
         * Output: 1
         */
        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1));
        /**
         * Example 2:
         * Input: [4,1,2,1,2]
         * Output: 4
         *
         */
        int[] nums2 = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums2));
    }
}


/**
 * --DesCription
 * 처음 순서대로가면   {4, 1, 2, 1, 2,}
 * i=0
 * 0^ num[0] == 0000 ^ 0100
 * rst => 0100
 * <p>
 * i=1
 * 4^num[1] == 0100 ^ 0001
 * rst = 0101
 * <p>
 * i=2
 * 6 ^ num[2] == 0101 ^ 0010
 * rst => 0111
 * <p>
 * i=3
 * 7 ^ num[3] == 0111 ^ 0001
 * rst => 0110
 * <p>
 * i=4
 * 6 ^ num[4] == 0110 ^ 0010
 * rst => 0100
 * 즉 남은 값은 4
 **/