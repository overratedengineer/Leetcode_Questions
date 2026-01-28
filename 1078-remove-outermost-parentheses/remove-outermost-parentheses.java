class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st = new StringBuilder();
        int count =0;
        
        for(char i:s.toCharArray()){
            if(i =='('){
                count++;
                 if(count>1){
                 st.append(i);
            }
            } else {
                 count--;
                 if(count>0){
                 st.append(i);
            }  
            }

           
        }

      return st.toString();
    }
}