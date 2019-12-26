//Method Prints from 0-n,
//replacing Fizz for anything divisible by 3
//replacing Buzz for anything divisible by 5
//replacing FizzBuzz for anything by both
public class FizzBuzz {
    public static void FizzBuzz(int n){
        
        for(int i=1; i<n+1; i++ ){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            
        }
            
    }
    public static void main(String[] args) {
        
        FizzBuzz(100);
    }
    
}
