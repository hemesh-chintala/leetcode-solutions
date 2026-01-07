//166
//Fraction To Recurring Decimal
//we have given two integers numerator and denominator of a fraction , we have return fraction in string format

import java.util.*;
class FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return "0";
        StringBuilder res=new StringBuilder();
        if(numerator<0 ^ denominator<0) res.append("-");
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        res.append(num/den);
        long reminder=num%den;
        if(reminder == 0) return res.toString();
        res.append(".");
        Map<Long,Integer>map=new HashMap<>();
        while(reminder!=0){
            if(map.containsKey(reminder)){
                int index=map.get(reminder);
                res.insert(index,"(");
                res.append(")");
                return res.toString();
            }
            map.put(reminder,res.length());
            reminder *=10;
            res.append(reminder/den);
            reminder %= den;
        }
        return res.toString();
    }
    public static void main(String args[]){
        FractionToRecurringDecimal sol=new FractionToRecurringDecimal();
        System.out.println(sol.fractionToDecimal(1, 2));    
        System.out.println(sol.fractionToDecimal(2, 3));    
        System.out.println(sol.fractionToDecimal(4, 333)); 
        System.out.println(sol.fractionToDecimal(1, 5));    
        System.out.println(sol.fractionToDecimal(-50, 8)); 
    }
}