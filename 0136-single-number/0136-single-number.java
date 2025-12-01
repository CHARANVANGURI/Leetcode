class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==a){
                    c=c+1;
                }
            }
        if(c==1){
            return a;
        }}
        return -1;}
}