//Counts amount of max values in array
// ie. 1,2,3,4,4 ... there are two 4's which are max values
public class birthdayCandles {
    static int birthdayCakeCandles(int[] ar) {
        int count=0;
        int max=ar[0];//initialized to initial.
        
        for (int i=0;i<ar.length;i++){
            if (ar[i]>max){
                max=ar[i];
                count=0;
            }
            if (ar[i]==max){
                count++;
            }
            
        }

        return count;
    }
    
}
