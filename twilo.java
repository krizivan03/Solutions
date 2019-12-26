
import java.util.ArrayList;
import java.util.List;
//Personal Twillo Interview

public class twillo {
    //match() receives two Lists of String value. 
    //the prefix List contains prefixes of phone numbers while numbers contains the actual numbers themselves
    //Task was to check and see if prefixes were contained in the numbers and if there was more than one return the highest one,
    //they were returned in a List full of Strings as well
    //ie numbers 16026225145,16026239368,14802671234,19999999999 prefixes 602,623,480,1
    //Would return 602,623,480,1
    public static List<String> match(List<String> prefixes, List<String> numbers) {
        List<String> ans = new ArrayList<String>();//where the answer will be returned
        String temp="";
        
        for(int i=0;i<numbers.size();i++){
            for(int j=0; j<prefixes.size();j++){
                temp= j==0? "":temp;
                if(numbers.get(i).contains(prefixes.get(j))){
                    temp = temp.compareTo(prefixes.get(j))<0? prefixes.get(j):temp;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    
    
    //This method takes a string of message similar to that of a message in a cellular device
    // its supposed to seperate the message into a fixed message size if it goes over the amount
    public static List<String> segments(String message) {
      List<String> ans= new ArrayList<String>();
      
      int msgSize=30;
      int j=message.length()/msgSize;
      int k=msgSize;
      
      if (message.length()>msgSize){
          for(int i=0;i<j;i++){        
              ans.add(message.substring(i*msgSize, k)+" ("+(i+1)+"/"+(j+1)+")");
              if (i==j-1){
                  ans.add(message.substring(k+1,message.length())+" ("+(i+1)+"/"+(j+1)+")");
              }
              k+=msgSize;
              
          }
          
      }
      else ans.add(message);
      
      
      return ans;
    }
    public static void main(String[] args) {
        System.out.println(segments("Hi my name is Christopher Canales.\n"
                + "This is my interview question I was assessed by Twillo.\n"
                + "I thought I did pretty well so I decided to upload it to gitHub for"
                + "other recruiters to see "));

       
    }
    
}
