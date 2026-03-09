class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        //nt ans[] = new int[n];
        // map.put(nums2[n-1],-1);
        // st.push(nums2[n-1]);
        for(int i=n-1;i>=0;i--){
          while(!st.isEmpty()&& nums2[i]>=st.peek()){
            st.pop();
          }
          map.put(nums2[i],st.isEmpty()?-1:st.peek());
          st.push(nums2[i]);
        }
        int m = nums1.length;
        int ans1[] = new int[m];
        int j=0;
        for(int i:nums1){
           ans1[j] =map.get(i);
           j++;
        }
return ans1;

    }
}