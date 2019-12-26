//method takes in an array of ints
//returns ratios of positives,negatives and zeros in a size 3 array
//Prints them out as floats

public class plusMinus {
    static void plusMinus(int[] arr) {
        int s = arr.length;
        int p=0,m=0,z=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                z++;
            }
            else{
                if(arr[i]>0)
                    p++;
                else m++;
            }
        }
        System.out.println((float)p/(float)s);
        System.out.println((float)m/(float)s);
        System.out.println((float)z/(float)s);

    }
}
