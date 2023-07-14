import java.util.*;

public class StackB_1{
    public static void printStack(Stack <Integer> n) {
        while(!n.isEmpty()) {
            System.out.println(n.pop());
        }
    }
    public static void pushAtBottom(Stack <Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s , data);
        s.push(top);
    }
    public static String reverseString(String str) {
        Stack <Character> s = new Stack<>();
        int idx =0;

        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            res.append(curr);
        }

        return str = res.toString();
    }
    public static void reverseStack(Stack <Integer> n) {
        if(n.isEmpty()){
            return;
        }

        int top = n.pop();
        reverseStack(n);
        pushAtBottom(n, top); 
    }public static int[]  stockSpan(int stock [],int span []) {
        
        Stack <Integer> s = new Stack<>();

        for( int i=0; i<stock.length; i++) {
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i+1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i); 
        }
        return span; 
    } 
    public static void nextGreaterElement(int arr[]) {
        Stack <Integer> s = new Stack<>();
        int nxtGreater [] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {

            //while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // if else
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // push in stack
            s.push(i);
        }
        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
    }
    public static boolean validParenthesis(String str) {
        Stack <Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            // opening brace
            if(c == '{' || c == '[' || c == '(' ) {
                s.push(c);
            } else {
                // closing
                if(s.isEmpty()) {
                    return false;
                }
                if((s.peek() == '(' && c == ')') 
                    || (s.peek() == '[' && c == ']') 
                    || (s.peek() == '{' && c == '}') ) 
                    {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean dupParetheses(String str1) {
        Stack <Character> s = new Stack<>();

        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);

            //Closing 
            
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;    //duplicate
                } else {
                    s.pop();    //opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void maxArea(int ht[]) {
        int recArea = 0;
        int nsL[] = new int [ht.length];
        int nsR[] = new int [ht.length];

        // Next Smaller left 
        Stack <Integer> s = new Stack<>();
        for(int i=0; i<ht.length; i++) {
            while (!s.isEmpty() && ht[s.peek()] >= ht[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsL[i] = -1;
            } else {
                nsL[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Right
        s = new Stack<>();
        for(int i=ht.length-1; i>=0; i--) {
            while (!s.isEmpty() && ht[s.peek()] >= ht[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsR[i] = ht.length;
            } else {
                nsR[i] = s.peek();
            }
            s.push(i);
        }
        // CurrentArea
        for(int i=0; i<ht.length; i++) {
            int height = ht[i];
            int width = nsR[i] - nsL[i] -1;
            int curArea = height *  width;
            recArea = Math.max(curArea,recArea);
        }
        System.out.println("The largest area of histogram is = " +recArea);
    }
    public static void main(String [] args) {
        // Stack <Integer> s  = new Stack <>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        // // Q.2

        // String str =  "armaghan";

        // System.out.println(reverseString(str));

        // Q.3
        Stack <Integer> n = new Stack<>();
        n.push(1);
        n.push(2);
        n.push(3);

        reverseStack(n);
        printStack(n);


        // Q.4  #Stock Span Problem
        System.out.println("QUE 4");
        int stock [] = {100,80,60,70,60,85,100};
        int stock1 [] = {80,100,50,70,90};
        int span [] = new int [stock.length];
        stockSpan(stock1,span);
        for(int i=0; i<stock.length; i++) {
            System.out.println(span[i]);
        }
        
        // Q.5  #next Greater right
        System.out.println("Question No 5");
        int arr [] = {6,8,0,1,3}; 
        nextGreaterElement(arr);

        // Q.6      Valid parenthesis
        String str = "(){[()]}";
        System.out.println(validParenthesis(str));

        // Q.7      #Duplicate Parentheses
        String str1 = "((a+b)+(c))";
        String str2 = "(((a+b)+c))";
        String str3 = "((a-b))";

        System.out.println(dupParetheses(str3));

        // Q.7  #Max Area in Histogram
        
        int height[] = {2,1,5,6,2,3};
        maxArea(height);



    }
}