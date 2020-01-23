/* This is a Number Guesser Program using Binary Search */


    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in); 
       
       int l=0,r=10;//change this r if you'd like to change the size sample
       int n = r/2;
       
       System.out.print("Hi, Think of a number between 0-"+r+"!\n\nREADY?(Yes or No)\n");
       while(!kb.next().equalsIgnoreCase("Yes")){
        System.out.print("How about now\n");   
       }
       System.out.println("\nOk, let me try and guess it.\n");
       System.out.println("Is " + n + " your number?");

       while(!kb.next().equalsIgnoreCase("Yes")){
           System.out.print("Higher? Or Lower?\n");    
           if(kb.next().equalsIgnoreCase("higher")){
               l=n+1;
               n=(l+r)/2;
               System.out.println("Is " + n + " your number?");
           }
           else{
               r=n-1;
               n=(l+r)/2;
               System.out.println("Is " + n + " your number?");
           }
       }
       System.out.print(n + " is your number!"); 
    }
