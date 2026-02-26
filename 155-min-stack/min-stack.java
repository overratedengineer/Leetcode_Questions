import java.util.*;

class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {

        if(st.isEmpty()){
            st.push((long)val);
            min = val;
            return;
        }

        if(val >= min){
            st.push((long)val);
        }
        else{
            long encoded = 2L*val - min;
            st.push(encoded);
            min = val;
        }
    }
    
    public void pop() {

        if(st.isEmpty()) return;

        long top = st.pop();

        // encoded value
        if(top < min){
            min = 2*min - top;
        }
    }
    
    public int top() {

        long top = st.peek();

        if(top < min)
            return (int)min;

        return (int)top;
    }
    
    public int getMin() {
        return (int)min;
    }
}