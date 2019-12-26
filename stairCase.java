/* Print the following stair case given n steps
     #
    ##
   ###
  ####
 #####
######
*/

public class stairCase {
    static void staircase(int n) {
        char[] s = new char[n];//creates char array of size n
        
        for(int i=0;i<n;i++){
            s[i]=' ';
        }//fills size n char array with space or ' '.
        for(int j=s.length-1;j>=0;j--){//starting with last index of array, changes to '#' and prints into new line.
            s[j]='#';
            System.out.println(s);
        }
        
        
        
    }
public static void main(String[] args) {
       staircase(100);//six actual stairs
        
    }
}
