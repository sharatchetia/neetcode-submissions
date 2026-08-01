class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                int width = j-i;
                int ht = Math.min(heights[i], heights[j]);

                int currArea = width*ht;

                maxWater = Math.max(currArea, maxWater); 
            }
        }
        return maxWater;
    }
}
