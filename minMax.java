// Checks Min/Max Sums of array by finding Min/Max Values
// MaxSum= totalSum-Min
// MinSum= totalSum-Max
public class minMax {
        static void miniMaxSum(int[] arr) {
        long min=arr[0],max=arr[0];//initializing min/max vals
        long minsum=0,maxsum=0;//initialize min/max sums to 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
            
            maxsum+=arr[i];
            if(i==arr.length-1){
                minsum=maxsum-max;
                maxsum=maxsum-min;
                
            }
        }
        System.out.println(minsum + " " + maxsum);
        

    }
}
