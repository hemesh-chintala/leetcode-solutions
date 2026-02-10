//13 Roman to Integer
/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000 */

import java.util.*;
class leetcode_013 {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int first = value(s.charAt(i));
            int next = value(s.charAt(i + 1));

            if (first < next) {
                total -= first;
            } else {
                total += first;
            }
        }

        // add last character
        total += value(s.charAt(s.length() - 1));
        return total;
    }

    private int value(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else if (c == 'M') return 1000;
        else return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        leetcode_013 s1=new leetcode_013();
        int result = s1.romanToInt(s);
        System.out.println(result);
    }
}

