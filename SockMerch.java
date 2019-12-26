
import java.util.*;

//Method socKMerchant takes in n amount of socks and an array of ints
//Counts amount of pairs in an array with the use of a HashSet

public class SockMerch {
    
    static int sockMerchant(int n, int[] ar) {
     int pairs = 0;
     HashSet<Integer> s = new HashSet<Integer>();
     
     for(int i=0; i<ar.length;i++){
         if (s.contains(ar[i])){
             s.remove(ar[i]);
             pairs++;
         }
         else s.add(ar[i]);
     }

       return pairs;
    }
    
}
