public class Solution {
    public int candy(int[] ratings) {
        int sum = 0;
        int[] leftaar = new int[ratings.length];
        int[] righaar = new int[ratings.length];
        Arrays.fill(leftaar, 1);
        Arrays.fill(righaar, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                leftaar[i] = leftaar[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                righaar[i] = righaar[i + 1] + 1;
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(leftaar[i], righaar[i]);
        }
        return sum;
    }
}