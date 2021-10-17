

// Tried on LeetCode
// Time Complexity = O(N)
// Space Complexity = O(1)
public class Question6 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int temp = 0;
        for (int x: nums){
            sum = sum + x;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (temp == sum - temp - nums[i]){
                return i;
            }
            temp = temp + nums[i];
        }
        return -1;
    }
}
