//20
//Valid Parenthesis
/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.  An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type. */

import java.util.*;

class leetcode_20 {
    public static boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                ch.push(s.charAt(i));
            }
            else{
                if(ch.isEmpty()){
            return false;
        }
        char top = ch.pop();
            if(s.charAt(i) == ')' && top != '(' || s.charAt(i) == '}' && top != '{' ||s.charAt(i) == ']' && top != '[' )
            return false;
            }  
        }
        return ch.isEmpty();
    }
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = isValid(s);
        System.out.println(res);
    }

}