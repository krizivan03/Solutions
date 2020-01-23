 /*
    You are given an array of  integers, , and a positive integer.
    Find and print the number of  pairs where i<j  and ar[i] + ar[j] is divisible by k.
    For example,ar=[1,2,3,4,5,6] and k = 5  Our three pairs meeting the criteria are
    [1,4],[2,3],[4,6]. So divisibleSumPairs returns 3
    */
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count=0;
        
        for(int i =0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])%k==0){
                    count++;
                }
            }
        }
        return count++;

    }
