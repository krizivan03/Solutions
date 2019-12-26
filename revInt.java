


import java.util.*;
import java.math.*;


public class revInt {
    
    //returns an integer in reverse
    public static int revInt(int x){
      Boolean bool=false;
        if (x<0){//checks if x is negative
            bool=true;
            x=x*-1;
        }
        String y=Integer.toString(x);//turn int to string
        char[] temp = y.toCharArray();//turn string ito char array
        int j=temp.length-1;
        
        for (int i=0; i<temp.length/2; i++){
            char t=temp[i];
            temp[i]=temp[j];
            temp[j]=t;
            j--;
        }
        y=String.valueOf(temp);
        int z=Integer.valueOf(y);
        if(bool==true){
            z*=-1;
        }
        return z;
        
    }
    
    
    
    
    
     public static void main(String[] args) {
        System.out.println(revInt(-1534));
        
    }
    
}
