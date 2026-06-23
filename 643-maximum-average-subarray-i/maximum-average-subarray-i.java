class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        int l=0;
        int r=0;
        int c=0;
        int sum=0;
        double max_avg=Integer.MIN_VALUE;
        while(r<nums.length)
        {
            sum+=nums[r];
            c++;
            if(c==k)
            {
                double val=(double)sum/k;
                max_avg=Math.max(max_avg,val);
                sum-=nums[l];
                l++;
                c--;
            }
            r++;
        }
        return max_avg;
    }
}