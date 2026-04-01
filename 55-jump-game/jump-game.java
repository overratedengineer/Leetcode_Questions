class Solution {
    public boolean canJump(int[] arr) {
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(i > max) return false;
            if(i + arr[i] > max){
                max = i + arr[i];
            }
        }
        return true;
    }
}