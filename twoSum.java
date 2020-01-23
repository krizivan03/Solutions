/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
assume that each input would have exactly one solution, and you may not use the same element twice.
ie. 
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public int[] twoSum(int[] ar, int k) {
        int[] ans = new int[2];
        for(int i =0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])==k){
                    ans[0]= i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
