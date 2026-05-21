class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=(nums.length*2);
        int result[]=new int[size],i=0;
        for(i=0;i<nums.length;i++){
            result[i]=nums[i];
            result[nums.length+i]=nums[i];
        } 
        
        return result;
    }
}