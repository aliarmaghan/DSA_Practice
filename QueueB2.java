import java.util.*;

public class QueueB2 {
    public static void interLeave(Queue<Integer> q) {
        Queue <Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++) {
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    // Q.6------------------------------------------
    public static void reverse(Queue<Integer> qu) {
        Stack <Integer> s = new Stack<>();

        while(!qu.isEmpty()) {
            s.push(qu.remove());
        }
        while(!s.isEmpty()) {
            qu.add(s.pop());
        }
    }
    

    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();

        // Q.6------------------------------------------
        Queue <Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);

        reverse(qu);

        while(!qu.isEmpty()) {
            System.out.print(qu.remove()+" ");
        }
        System.out.println();
    }
}