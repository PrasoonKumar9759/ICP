class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(candidates);
        call(candidates,target,0,ll,ans);
        return ans;
    }
    public void call(int[] arr,int k,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(k==0){
            // if(!ans.contains(ll)){
                ans.add(new ArrayList<>(ll));
            // }
        }
        for(int i=idx;i<arr.length && k>=arr[i];i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            ll.add(arr[i]);
            call(arr,k-arr[i],i+1,ll,ans);
            ll.remove(ll.size()-1);
           
        }
    }

}