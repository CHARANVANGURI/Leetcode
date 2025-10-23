class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx=0;
        int cn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cn=cn+1;
                mx=Math.max(mx,cn);
            }
            else{
                cn=0;
            }
        }
        return mx;
    }
}