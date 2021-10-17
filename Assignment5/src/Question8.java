

// Tried on LeetCode
// Time Complexity = O(log N)
// Space Complexity = O(1)
public class Question8 {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        if(target < nums[0]){
            for(int i = nums.length - 1; i >= 0 ; i--){
                if(nums[i] < target){
                    return -1;
                }
                if(nums[i] == target){
                    return i;
                }
            }
        } else {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
                if(nums[i] > target){
                    return -1;
                }
            }
        }
        return -1;
    }
}
