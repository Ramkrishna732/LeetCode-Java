class Solution {
    public int largestAltitude(int[] gain) {
         int max=0;
        int add=0;
        for(int i=0;i<gain.length;i++){
            add+=gain[i]; 
            max=Math.max(add, max);
        }
        return max;
    }
}
