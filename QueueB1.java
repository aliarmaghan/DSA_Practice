
import java.util.*;


public class QueueB1{
    static class Queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<> ();
    

        public void add(int n) {
            s1.push(n);
        }

        public  int remove() {
            if(s1.isEmpty()) {
                return -1;
            }
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int top = s2.pop();
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return top;
        }
        
        public  int peek() {
            if(s1.isEmpty()) {
                return -1;
            }
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int top = s2.peek();
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return top;
        }
        public  boolean isEmpty(){
            return s1.isEmpty();
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
