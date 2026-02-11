//28. Find the Index of the First Occurrence in a String

import java.util.Scanner;

class leetcode_28 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 ){
            return 0;
        }
        int n=haystack.length();
        int m=needle.length();
        for (int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
            if(j==m)
                  return i;  
        
        }
        return -1;
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        int res = strStr(haystack, needle);
        System.out.println(res);
        sc.close();
    }
}