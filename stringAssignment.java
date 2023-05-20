import java.util.*;


public class stringAssignment {
    public static int countVowel(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void equal() {
        String str = "Md Ali Armaghan";
        String str1 = "apnaCollege";
        String str2 = "Md Ali Armaghan";

        System.out.println(str.equals(str1)+" " +str.equals(str2));
    }
    public static void anagram(String str,String str1) {
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length()){
            char [] strcharArray = str.toCharArray();
            char [] str1charArray = str1.toCharArray();

            Arrays.sort(strcharArray);
            Arrays.sort(str1charArray);

            boolean result = Arrays.equals(strcharArray,str1charArray);
            if(result) {
                System.out.println(str + " and " + str1 +" are anagrams of each other");
            } else {
                System.out.println(str + " and " + str1 +" are not anagrams of each other");
            }
        } else {
            System.out.println(str + " and " + str1 +" are not anagrams of each other");
        }
    }
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(countVowel(str)); 
        // equal();
        // String str = "ApnaCollege".replace("l","");
        // System.out.println(str);
        String str = "race";
        String str1 = "cares";
        anagram(str, str1); 
    }
}