class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int max=0,c=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c++;
        }else{
            if(max<c){
                max=c;
            }
            c=0;
        }
     }   
     return max>c?max:c;
    }
}