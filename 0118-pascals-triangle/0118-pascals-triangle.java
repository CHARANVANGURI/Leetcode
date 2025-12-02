class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        arr.add(a);
        for(int i=1;i<numRows;i++){
            List<Integer> ae=new ArrayList<>();
            ae.add(1);
            for(int j=1;j<i;j++){
                int val=arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
                ae.add(val);
            }
            ae.add(1);
            arr.add(ae);

        }
       
        return arr;
    }
}