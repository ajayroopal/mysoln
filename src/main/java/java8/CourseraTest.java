package java8;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CourseraTest {
}
 /*   public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT
    }*/

    //exact match - match "abc" "abc"
    //wild card match abc ab.
    //bcd xya? - false

   /* public boolean myRegexExactMatch(String sourceString, String p) {
        //check that String is not null
     /*   if (sourceString == null || p == null) {
            return false;
        }

        if ((sourceString.equals(p) || sourceString.contains(p))) {
            return true;
        }

    }

    public boolean myRegexWildCrdMatch(String sourceString, String p) {
        //If the pattern is more in length than the String than mismatch
        if (p.length() > sourceString.length()) {
            return false;
        }

        //Travese the String and pattern
        //Check if the character matches
        //If not if there is a . move  a character on the source String
        //Go to the end if pattern finishes than means true else any other condition will flag false

        //Once the charcter matches we should match each of the character following or .
        boolean characterMatch = false;
        char[] sourceS = sourceString.toCharArray();
        int index = 0;
        char[] pat = p.toCharArray();
        for (int i = index; i < p.length(); i++) {

            if (sourceS[i] == p[i]) {
                characterMatch = true;
                if (matchWildCard(sourceS, pat, i) == -1) {
                    return true;
                } else
                    index = matchWildCard(sourceS, pat, i);
            }

            return false;

        }
        return false;
    }

    //int = -1 matches
    //index =
    private int matchWildCard(char[] source, char[] pattern, int index) {
        for (int i = index; i < pattern.length; i++) {
            if (!(source[i] == pattern[i] || source[i] == '.')) {
                return index;


            }
            return -1;

        }
    }*/






