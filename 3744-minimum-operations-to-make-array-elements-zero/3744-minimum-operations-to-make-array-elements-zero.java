class Solution {
    long solve(int l,int r){
        long L=1,S=1,step=0;
        while(L<=r){
            long R=4*L-1;
            long start=Math.max(L,(long)l);
            long end=Math.min(R,(long)r);
            if(start<=end){
                step+=(end-start+1)*S;
            }
            S=S+1;
            L=L*4;
        }
        return step;
    }
    public long minOperations(int[][] queries) {
        long result=0;
        for(int num[]:queries){
            int l=num[0];
            int r=num[1];
            long step=solve(l,r);
            result+=(step+1)/2;
        }
        return result;
    }
}