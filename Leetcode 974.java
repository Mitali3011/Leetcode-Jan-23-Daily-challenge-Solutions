class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int n = nums.length, sum=0, curr=0, ans=0;
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);

        for(int i=0; i<n; i++){
            sum += nums[i];
            curr = (sum%k + k)%k; 
            if(hs.containsKey(curr)) {
                ans += hs.get(curr);
                hs.put(curr, hs.get(curr)+1);
            }
            else{
                hs.put(curr,1);
            }
        }

        return ans;
    }
}