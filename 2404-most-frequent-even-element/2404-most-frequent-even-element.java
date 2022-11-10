class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
		
		
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
		
		
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                if(map.get(nums[i]) > max){
                    max = map.get(nums[i]);
                }
            }
            
        }
        
		
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0 && map.get(nums[i]) == max){
                return nums[i];
            }
        }
        return -1;
    }
}
