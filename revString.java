import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//Reverses the string that is passed in.
public class revString {

    public static Scanner kb = new Scanner(System.in);

    public static void revStr(String str) {
        
        char[] cstr = str.toCharArray();
        
        int j = cstr.length;
        for (int i = 0; i < str.length() / 2; i++) {
            char temp =cstr[i];
            cstr[i] = cstr[j - 1];
            cstr[j-1]=temp;
            j--;
        }
        String Str = String.valueOf(cstr);
        System.out.println("\n"+Str);
    }

    public static void main(String[] args) {
        revStr("Hello World!");
    }

}
