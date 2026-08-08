import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '}'){
                if(!st.isEmpty()){
                    char d = st.pop();
                    if(d != '{') return false;
                } else return false;
            }
            else if(c == ')'){
                if(!st.isEmpty()){
                    char d = st.pop();
                    if(d != '(') return false;
                } else return false;
            }
            else if(c == ']'){
                if(!st.isEmpty()){
                    char d = st.pop();
                    if(d != '[') return false;
                } else return false;
            }

            else{
                st.push(c);
            }
        }

        return st.isEmpty();
    }
}