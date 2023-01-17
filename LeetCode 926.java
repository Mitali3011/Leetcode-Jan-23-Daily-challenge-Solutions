class Solution {
    
    public int minFlipsMonoIncr(String s) {
        int n = s.length(), temp=0, prev=0;
        int count = (s.charAt(0)=='0')?0:1; 
        
        for(int curr=1; curr<n; curr++){
            int x = (s.charAt(curr)=='0')?0:1;
            count += x; 

            if(s.charAt(curr)=='1'){
                temp = prev;
            }
            else{
                temp = Math.min(count, 1+prev);
            }
            prev = temp; 
        }
        return temp;
    
    }
}