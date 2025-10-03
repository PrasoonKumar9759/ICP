class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        call(n,k,ll,ans,1);
        return ans;
    }
    public  void call(int n, int k,List<Integer> ll,List<List<Integer>> ans,int idx){
        if(k==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<=n;i++){
            ll.add(i);
            call(n,k-1,ll,ans,i+1);
            ll.removeLast();
        }
    }
}