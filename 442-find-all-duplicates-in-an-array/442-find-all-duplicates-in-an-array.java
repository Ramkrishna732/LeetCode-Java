import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      Arrays.sort(nums);
    LinkedList<Integer> list = new LinkedList<Integer>();
    for(int i=0 ; i<nums.length-1 ; i++){
        if(nums[i] == nums[i+1]){
            list.add(nums[i]);
        }
    }
    return list;
}}