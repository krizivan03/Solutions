 /* Given a scenerio where your given a hershey bar,where each square is given a value
    you'll share with someone that hershey bar in segments of m that add up to d. 
    m will be dependent on "month" or "day". 
    ie
    List s [1,2,1,3,2] if searching 2 factors (m) that add to 3(d) that are near
    eachother will return 2, [1,2],[2,1] */
    
static int birthday(List<Integer> s, int d, int m) {
    int sum = 0;//iterative sum
    int j = 0 ;//other indices
    int count = 0;//answer
    int c = 0;//numsums
    
    for(int i=0;i<=s.size()-m;i++){
        while(sum<d){
            sum+=s.get(i+j++);c++;
            if (c == m) break;
        }
        count = sum == d && c == m? ++count : count;
        sum=0;j=0;c=0;//reset iterative values
    }
    return count;
    }
   
    public static void main(String[] args) {
       
       
       List<Integer> s = new ArrayList<Integer>();
       s.add(1);
       s.add(2);
       s.add(1);
       s.add(3);
       s.add(2);
       System.out.print(birthday(s,3,2));
    }
