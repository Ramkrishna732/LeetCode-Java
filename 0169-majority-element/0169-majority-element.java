class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int count = 0, majorityele = 0;
        for(int i = 0; i < nums.length ; i++) {
            if(count == 0)
                majorityele = nums[i];
            count = majorityele == nums[i] ? ++count : --count;
        }
        return majorityele;
    }
}