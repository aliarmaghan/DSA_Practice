import java.util.*;

public class DequeN{
    static class Stack {
        Deque <Integer> deque = new LinkedList<Integer>();

        public void push(int data) {
            deque.addLast(data);
        }

        public  int pop(){
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }
    static class Queue {
        Deque <Integer> deque = new LinkedList<>();

        public void add(int n) {
            deque.addLast();
        } 
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}