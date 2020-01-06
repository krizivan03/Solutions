/*
Given List arr of Integer values 1-5 (Each representing a certain bird) return which
Integer (bird) is more frequently seen in the population given.
This answer is O(n)
*/
static int migratoryBirds(List<Integer> arr) {

        int[] count = {0,0,0,0,0,0};//value 0 will not be used.
        int max=0;
        
        for (int i =0; i<arr.size();i++){
        
            count[arr.get(i)]++;
            max =  count[arr.get(i)] > count[max] ? arr.get(i):max;
            
        }
        return max;
        }
