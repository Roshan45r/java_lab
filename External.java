package SEE;
import CIE.Student;
import java.util.*;

public class External extends Student{
    public int seeMarks[];

    public External(){
        super();
        seeMarks = new int[5];
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter external marks of 5 subjcts");

        for(int i = 0; i<5; i++){
            seeMarks[i] = sc.nextInt();
        }
    }
}
