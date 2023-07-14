import java.util.*;

public class StackB{
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data) {
    //         this.data =  data;
    //         this.next =  null;
    //     }
    // }
    // static class Stack{
    //     static Node head = null;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }

    //     // push
    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         if(isEmpty()) {
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head =  newNode;
    //     }

    //     // pop
    //     public static int pop() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         int top = head.data;
    //         head =  head.next;
    //         return top;
    //     }

    //     // peek
    //     public static int peek() {
    //         if(isEmpty()) {
    //             return -1;
    //         }
    //         return head.data;
    //     }
    // }
    // static ArrayList <Integer> al = new ArrayList<>();
    // public static boolean isEmpty() {
    //     return al.size() == 0;
    // }

    // // push O(1)
    // public static void push(int data) {
    //     al.add(data);
    // }

    // // pop O(1)
    // public static int pop() {
    //     if(isEmpty()) {
    //         return -1;
    //     }
    //     int top = al.get(al.size()-1);
    //     al.remove(al.size()-1);
    //     return top;
    // }

    // //peek  O(1)
    // public static int peek(){
    //     if(isEmpty()){
    //     return -1;
    //     }
    //     return al.get(al.size()-1);
    // }
        

    public static void main(String[] args) {
        // Stack s = new Stack();
        Stack <Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}