import java.util.*;


public class string{
    public static void printlatter(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static boolean ispalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static float shortestDirection(String str) {
        int x = 0 , y = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //south

            if(ch == 's') {
                y--;
            }
            //north
            else if(ch == 'n') {
                y++;
            }
            //west
            else if(ch == 'w') {
                x--;
            }
            //east
            else if (ch == 'e') {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return(float)(Math.sqrt(x2+y2));
    }
    public static String substring(String str,int si,int ei) {
        String substrings ="";
        for(int i=si; i<ei; i++) {
            substrings += str.charAt(i)+" ";
        }
        return substrings;
    }
    public static String largestStrings(String fruits[]) {
        String large = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(large.compareTo(fruits[i])<0) {
                large = fruits[i];
            }

        }
        return large;
    }
    public static void stringbuilder() {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    public static String toUpperCase(String st) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(st.charAt(0));
        sb.append(ch);

        for(int i=1; i<st.length(); i++) {
            if(st.charAt(i) == ' ' && i<st.length()-1) {
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
                
            } else {
                sb.append(st.charAt(i));
            }
        }
        return sb.toString();
    }
    // Compress question using StringBuilder
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    // Compress ques using +=
    public static String compresses(String str) {
        String newstr = "";
        for(int i=0; i<str.length; i++) {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;//3
                i++;//2
            }
            newstr += str.charAt(i);
            
            if(count > 1) {
                newstr += count;
            }
        }
        return newstr.toString();
    }
    public static void main(String args[]) {
        String str = "aaabcd";
        System.out.println(compress(str));
    }
}