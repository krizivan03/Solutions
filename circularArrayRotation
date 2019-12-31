    /* Given an int array, and a key, this function rotates int values in array
    to the right with respect to key value and then returns an int array of values
    at specified locations (given array q).
    */
    
    static int[] circularArrayRotation(int[] a, int k,int[] q) {
       LinkedList<Integer> lL = new LinkedList<Integer>();
       for(int i=0;i<a.length;i++){
           lL.add(a[i]);
       }
       int temp;
       for(int j =0; j<k;j++){
        temp=lL.getLast();
        lL.remove(lL.size()-1);
        lL.addFirst(temp);
       }
       
       int[] ans = new int[q.length];
       for(int l=0;l<q.length;l++){
           ans[l]=q[l];
       }

        return ans;
    }
