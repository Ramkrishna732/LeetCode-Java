class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        List<Integer> arr=new ArrayList<>();
   for(int element:nums){
       arr.add(element);
   }
       while(arr.contains(original)){
           original*=2;
       }
  return original;
    }
    
}