package com.bbd.pingpong;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanConverter {
    public static int Convert(String s)
    {
        int sum = 0;
        int diff = 0;
        boolean skip = false;

        s = s.toUpperCase();
        //String pattern = "(I|V|C|D|L|X)\\1\\1\\1";
        //Pattern r = Pattern.compile(pattern);
        //Matcher m = r.matcher(s);
        //if (m.find( )) {
        //   throw new RuntimeException("Wrong format");
        //}
        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");

           for (int i = 0; i < s.length(); i++) {
                   if (s.charAt(i) == 'I') {
                       sum += 1;
                   } else if (s.charAt(i) == 'V') {
                       sum += 5;
                   } else if (s.charAt(i) == 'X') {
                       sum += 10;
                   } else if (s.charAt(i) == 'L') {
                       sum += 50;
                   } else if (s.charAt(i) == 'C')
                       sum += 100;
                   else if (s.charAt(i) == 'D')
                       sum += 500;
                   else if (s.charAt(i) == 'M')
                       sum += 1000;
                   else
                       throw new RuntimeException("Illegal Character");
           }
           if (sum > 1000)
           {
               throw new RuntimeException("Number over 1000");
           }
           return sum;
    }
}