class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int e1=-1;
        int e2=-1;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && e2!=nums[i]){
                e1=nums[i];
                c1++;
            } else if(c2==0 && e1!=nums[i]){
                e2=nums[i];
                c2++;
            } else if(e1==nums[i]){
                c1++;
            } else if (e2==nums[i]){
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int x : nums) {
            if (x == e1) c1++;
            else if (x == e2) c2++;
        }

        List<Integer> al = new ArrayList<>();
        if(c1>n/3) al.add(e1);
        if(c2>n/3) al.add(e2);
       
        return al;
    }
}