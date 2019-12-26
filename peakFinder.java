//This method takes in an int array and returns an int with the value of the highest peak
//peak being defined ass a height higher than the elements in front or behind.
//or just the elements next to them if theyre at the begining or end.
public class peakFinder {
    static int peakFinder(int[] n) {
        int peak=0;
        if (n.length==1){//Array length 1
            return 0;
        }
        if(n.length==2){//Array length 1
            return n[0]>n[1]? 0:1;
        }
        
        for(int i=0; i<n.length;i++){
            if (i==0){//Check first
                if(n[i]>n[i+1]){
                    peak =i;
                }
            }
            else{
                if(i==n.length-1){
                    if (n[i]>n[i-1]){
                        peak =n[i]>n[peak]? i:peak;
                    }
                    else peak+=0;
                }
                else if(n[i]>n[i-1] && n[i]>n[i+1]){
                peak =n[i]>n[peak]? i:peak;
                }  
            }
        }
        return peak;
    }
    
}
