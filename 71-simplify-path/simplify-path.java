class Solution {
    public String simplifyPath(String s) {
        String[] arr = s.split("/+");
        StringBuilder ans = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            } else if(!arr[i].equals(".") && !arr[i].equals("")) {
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty()) {
            ans.insert(0, "/" + st.pop());
        }
        if(ans.length() == 0) {
            return "/";
        }
       return ans.toString();
    }
}