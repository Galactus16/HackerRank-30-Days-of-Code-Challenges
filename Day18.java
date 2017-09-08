public class Solution {
    // Write your code here.
    Stack st = new Stack();
    Queue qu = new LinkedList();
    
    void pushCharacter(char ch){
        st.push(ch);
    }
    
    void enqueueCharacter(char ch){
        qu.add(ch);
    }
    
    char popCharacter(){
        return (char)st.pop();
    }
    
    char dequeueCharacter(){
        return (char)qu.remove();
    }
    
    
    
    