finding next permutation:-
brute force approach:-
1.find all the permutation using recursion in sorted order
2.perform linear search and find the given permutation
3.return the next permutation




//optimal approach
intuition:-
1.find the breakpoint (breakpoint means finding the first index say ind from the back of the array where arr[ind]<arr[ind+1]
2.if the break point does not exist then just reverse the array.
3.if break point exists then find an element from last which is greater than the arr[ind] and swap with arr[ind].
4.now reverse the entire right half means from ind+1 to n-1.



code:-
class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        int ind2=-1;
        if(ind==-1)
        {
            reverse(0,n-1,nums);
        }else
        {
            for(int i=n-1;i>ind;i--)
            {
                if(nums[i]>nums[ind])
                {
                    ind2=i;
                    break;

                }

            }
            swap(ind,ind2,nums);
            reverse(ind+1,n-1,nums);
        }
        
    }
    public void swap(int a,int b,int[] arr)
    {
        int x=arr[a];
        arr[a]=arr[b];
        arr[b]=x;
    }
    public void reverse(int a,int b,int[] arr)
    {
        while(a<b)
        {
            swap(a,b,arr);
            a++;
            b--;
        }
        
    }
}