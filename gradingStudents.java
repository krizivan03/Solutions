
import java.util.*;

// Changes ArrayList of grades
// So long as grades 38 and above
// If next multiple of 5 is only 2 points near, round up, other wise grade stays the same
// ie 72 stays 72 , 73 rounds up to 75

// Condition to be met 
/*
If the difference between the grade and the next multiple of 5
is less than 3, round grade up to the next multiple of 5 .
*/
//  What I did
// so long as grades%5 > 2, or 3 and above, round up.
// ie 72%5=2 so grade stays 72
// ie 73%5=3 so grade rounds up to 75 by doing grade=grade-(grade%5)+5 or grade=73-(3)+5 

public class gradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i=0; i<grades.size();i++){//traverses throughout ArrayList
            if(grades.get(i)>=38){//only changes value if its 38+//
               grades.set(i, (grades.get(i)%5 )>2 ? grades.get(i)-(grades.get(i)%5)+5: grades.get(i));               
            }//sets whatever position i to either new grade (if condition met) or same grade .
            
        }
    
        return grades;
    }
    
}
