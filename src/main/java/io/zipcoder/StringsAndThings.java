package io.zipcoder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String [] inputArray = input.split("\\s");
        int count = 0;
        for (String s : inputArray) {
            if (s.endsWith("y") || s.endsWith("z"))
                count++;
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : withoutString("Hello there", "llo") // Should return "He there"
     * withoutString("Hello there", "e") //  Should return "Hllo thr"
     * withoutString("Hello there", "x") // Should return "Hello there"
     */
    public String withoutString(String base, String remove) {
        String newBase;
        newBase = (base.toLowerCase().contains(remove)) ? base.replace(remove, "") : base;
           return newBase;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : equalIsNot("This is not")  // Should return false
     * equalIsNot("This is notnot") // Should return true
     * equalIsNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean equalIsNot(String input) {
        int countIs = 0;
        int x = 0;
        while(x != -1){
            x = input.indexOf("is", x);
            if(x != -1) {
                countIs++;
                x++;
            }
        }
        int countNot = 0;
        int y = 0;
        while(y != -1) {
            y = input.indexOf("not", y);
            if (y != -1) {
                countNot++;
                y++;
            }
        }
        boolean answer = (countIs == countNot) ? true : false;

        return answer;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        boolean answer = false;
        for (int x = 1; x < input.length()-1; x++){
            char c = input.charAt(x);
            answer = (c == 'g' && (input.charAt(x-1) == c || input.charAt(x+1) == c )) ? true : false;
        }
        return answer;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count = 0;
        for (int x = 1; x < input.length()-1; x++){
            char c = input.charAt(x);
            if(input.charAt(x-1) == c && input.charAt(x+1) == c )
                count++;
        }
        return count;
    }
}
