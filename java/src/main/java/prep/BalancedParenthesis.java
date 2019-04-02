package prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {

    public static boolean check(String text){

        char[] arr = text.toCharArray();
        if(arr.length < 1) {
            System.out.println("length less than 1");
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< arr.length; i++){

            if(map.containsKey(arr[i]))
                stack.push(arr[i]);
            else {
                if(stack.isEmpty()) {
                    System.out.println("empty stack");
                    return false;
                }

                if(map.get(stack.pop()) != arr[i]) {
                    System.out.println(map.get(stack.pop())+ "mis match" + arr[i]);
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("stack contain garbage");
            return false;
        }
        System.out.println("no condition");
        return true;
    }
}
