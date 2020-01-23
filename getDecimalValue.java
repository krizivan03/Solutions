/*Given a linkedList of 1's and 0's representing binary number we return
a decimal value
*/
public int getDecimalValue(ListNode head) {
        List<Integer> a = new ArrayList<Integer>();
        int sum =0;
        
        while(head.next!=null){
            a.add(head.val);
            head=head.next;
        }
        a.add(head.val);
        
        int j=a.size()-1;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i)*(int)Math.pow(2, j--);
        }
            
        
        return sum;
    }
