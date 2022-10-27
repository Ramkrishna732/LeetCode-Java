class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer,String> nameandheigth =new HashMap<>();
        for(int i=0;i<names.length;i++){
            nameandheigth.put(heights[i],names[i]);
        }
        
        String[] names_results =new String[names.length];
        Arrays.sort(heights);
        int index=0;
        for(int i=heights.length-1;i>=0;i--){
          names_results[index++]=nameandheigth.get(heights[i]);  
        }
        return names_results;
    }
    
}