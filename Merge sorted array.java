class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[] ans=new int[m+n];
        int count=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[count]=nums1[i];
                i++;
                count++;
            }
            if(nums2[j]<nums1[i])
            {
                ans[count]=nums2[j];
                j++;
                count++;
            }
        }
        while(i<m)
        {
            ans[count]=nums1[i];
            i++;
            count++;
        }
        while(j<n)
        {
            ans[count]=nums2[j];
            j++;
            count++;
        }
        for( i=0;i<m+n;i++)
        {
            System.out.print(ans[i]);
            nums1[i]=ans[i];
        }

        
    }
}