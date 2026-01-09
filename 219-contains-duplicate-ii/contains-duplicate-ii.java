class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<nums.length;r++){
            int val = nums[r];
            if(!map.containsKey(val)){
                map.put(val,r);
            } else {
                int l = map.get(val);
                if(r-l < k+1){
                    System.out.println(r+" "+l);
                    return true;
                } else {
                    map.put(val,r);
                }
            }
        }
        return false;
    }
}