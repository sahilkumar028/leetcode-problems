class Solution {
    public int distinctAverages(int[] nums) {
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        int start=0;
        int end=100;
        Set<Float> s=new HashSet<>();
        while(start<=end){
            if(arr[start]!=0&&arr[end]!=0){
                float sum = start+end;
                float avg = sum/2;
                s.add(avg);
                arr[start]-=1;
                arr[end]-=1;
            }
            
            else if(arr[start]==0)start++;
            else end--;
        }
        return s.size();
    }
    public static int nonZero(int arr[],int direction){
        if(direction ==1){
            for(int i=0;i<99;i++){
                if(arr[i]!=0){
                    return i;
                }
            }
        }else{
            for(int i=99;i>0;i--){
                if(arr[i]!=0){
                    return i;
                }
            }
        }
        return 0;
    }
}