
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//checks if string is palindrome
//racecar is palindrome because backwards it reads
//racecar.

public class isPalindrome {

    public static Scanner kb = new Scanner(System.in);

    public static boolean isPalindrome(String str) {
        char[] cstr = str.toCharArray();
        Boolean bool = true;
        int j = cstr.length - 1;
        

        for (int i = 0; i < cstr.length / 2; i++) {
            if (cstr[i] != cstr[j]) {
                bool = false;
                break;
            }
            j--;
        }
        return bool;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("lol"));

    }

}
