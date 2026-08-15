class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int pse[] = new int[n];
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.add(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.add(i);
        }
        long sum = 0;
        int mod = 1000000007;
        for(int i=0;i<n;i++){
        long left = i - pse[i];
        long right = nse[i] - i;
        sum = (sum + (long) arr[i]*left*right)%mod;
        }
        return (int)sum;
    }
}