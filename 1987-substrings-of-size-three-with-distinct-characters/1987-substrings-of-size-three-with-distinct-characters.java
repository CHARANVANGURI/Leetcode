class Solution {
    public boolean fun(String s){
       HashSet <Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hs.add(c);
        }
        if(hs.size()==3){
            return true;
        }
        else{
            return false;
        }}
    public int countGoodSubstrings(String s) {
        int ans=0;
        int l=s.length();
        for(int i=0;i<l-3+1;i++){
            boolean temp=fun(s.substring(i,i+3));
            if(temp){
                ans=ans+1;
            }
        }
return ans;
}}