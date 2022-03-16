package CIE;

import java.util.*;

public class Internals{
    public int cieMarks[];
    public Internals(){
        cieMarks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter internal marks of 5 subjcts");

        for(int i = 0; i<5; i++){
            cieMarks[i] = sc.nextInt();
        }
    }
}
