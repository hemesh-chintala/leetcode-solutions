//014
//Longest Common Prefix
/*Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "". */
import java.util.*;
class leetcode_014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
       String first = strs[0];
       for (int i=1;i < strs.length;i++){
       while(!strs[i].startsWith(first)){
        first = first.substring(0,first.length()-1);

        if(first.length() == 0){
            return "";
        }
       }
       } 
       return first;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
        } 
        leetcode_014 l1=new leetcode_014();
        String res = l1.longestCommonPrefix(str);
        System.out.println(res);
    }
}