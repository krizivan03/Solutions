//Counts apples that fall into a range
//s & t are range
//a & b are starting points for apple/orange tree
//apples[],oranges[] are array of lengths that apples and oranges fell away from their starting points

public class cApplesnOranges {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int aC=0,oC=0;
        
        for(int i=0;i<apples.length;i++){
            apples[i]+=a;
            if(s<=apples[i] && t>=apples[i]){
                aC++;
            }
        }
        for(int j=0;j<oranges.length;j++){
            oranges[j]+=b;
            if(s<=oranges[j] && t>=oranges[j]){
                oC++;
            }
        }
        System.out.print(aC+"\n"+oC);
    }
    
}
