package prep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;

        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty())
            return false;

        Stack<Character> stack = new Stack<>();
        char[] arr = s1.toCharArray();
        for (char i : arr) {
            stack.add(i);
        }

        arr = s2.toCharArray();
        for (char i : arr) {
            if (stack.isEmpty()) {
                System.out.println("stack empty");
                return false;
            }

            Character poll = stack.pop();
            if (i != poll) {
                System.out.println(i + " != " + poll);
                return false;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("stack empty");
            return true;
        } else {
            System.out.println("stack not empty");
            return false;
        }
    }
}
