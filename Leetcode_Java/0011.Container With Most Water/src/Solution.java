
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        
        while(leftIndex < rightIndex){
            maxArea = Math.max(maxArea, Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex));
            if(height[leftIndex] < height[rightIndex]){
                leftIndex++;
            }else{
                rightIndex--;
            }
        }
        
        return maxArea;
    }
}