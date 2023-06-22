public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
        int[] ans=new int[2];
        int count=0;
        HashSet<Integer> h=new HashSet<>();
        
        for(int i=0;i<A.length;i++)
        {
           
            if(!h.contains(A[i]))
            {
                h.add(A[i]);
            }
            else
            {
                ans[count]=A[i];
                count++;
                
            }
        }
        for(int i=1;i<=A.length;i++)
        {
            if(!h.contains(i))
            {
                ans[count]=i;
            }
        }
        return ans;
    }
}
