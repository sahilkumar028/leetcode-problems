class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s=new HashSet<Integer>();
        while(n!=1){
            n=breakNum(n);
            if(s.contains(n)){
                return false;
            }
            if(!s.contains(n)){
                s.add(n);
            }
        }
        return true;
    }
    public int breakNum(int a){
        int sum=0;
        while(a!=0){
            sum=sum+square(a%10);
            a=a/10;
        }
        return sum;
    }
    public int square(int a){
        return a*a;
    }
}