import java.util.*;

//Given a string s, find the first non-repeating character in it and return its index.
//If it does not exist, return -1.
// Solution Complexity O(n)

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {


        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }

        return -1;



    }
    public static void main(String[] args) {
        String s  = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing" +
                " Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
        System.out.println(firstUniqChar(s));
    }
}
