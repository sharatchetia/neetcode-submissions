class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length-1;

        while(left<right){
            int wth = right - left;
            int ht = Math.min(heights[left], heights[right]);
            int currArea = wth * ht;

            maxWater = Math.max(maxWater, currArea);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxWater;
    }
}
