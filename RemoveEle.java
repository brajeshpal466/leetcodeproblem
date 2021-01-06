class RemoveEle {
    public static int removeElement(int[] nums, int val) {
        
        
        int l=  0; 
        int k=nums.length-1;
        while(l<=k){
            if (nums[l]==val && nums[k]!=val) {
                nums[l]=nums[k];
                nums[k]=val;
                l++;
                k--;
            }
            if (nums[k]==val) {
                k--;
            }
            if (nums[l]!=val) {
                l++;
            }
        }
        for (int h:nums) {
            System.out.println(h);
        }
        return --k;
    }
    public static void main(String[] args) {
        int nums []={0,1,2,2,3,0,4,2};
        int val=2;
       System.out.println("length"+removeElement(nums,val));
    }
}