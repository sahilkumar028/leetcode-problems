class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length=temperatures.length;
        Stack<Integer> s=new Stack<>();
        int[] days=new int[length];
        for(int i=0;i<length;i++){
        //     int count=0;
        //     for(int j=i;j<length;j++){
        //         if(temperatures[i]<temperatures[j]){
        //             days[i]=count;
        //             break;
        //         }
        //         count++;
        //     }
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int idx=s.pop();
                days[idx]=i-idx;
            }
            s.push(i);
        }
        return days;
    }
}