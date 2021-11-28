import java.sql.SQLOutput;
import java.util.*;

class student{
    int marks[]=new int[10];
    int cred[]=new int[10];
    int grade[]=new int[10];
    String name;
    String usn;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.next();
        System.out.println("Enter the USN : ");
        usn = sc.next();
        System.out.println("enter the marks in 5 subjects : ");
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the credits of 5 subjects : ");
        for(int i=0;i<5;i++){
            cred[i]=sc.nextInt();
        }
    }

    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("USN : "+usn);
        System.out.println("Subjects marks credits ");
        for(int i=0;i<5;i++)
            System.out.println("Subject"+(i+1)+" "+marks[i]+" "+cred[i]);
    }

    float sgpa() {
        int total_cred = 0;
        int sum = 0;
        float sgpa = 0;
        for (int i = 0; i < 5; i++) {
            if (marks[i] < 40)
                grade[i] = 10;
            else if (marks[i] == 100)
                grade[i] = 10;
            else
                grade[i] = (marks[i] / 10) + 1;
        }
        for (int i = 0; i < 5; i++) {
            total_cred += cred[i];
            sum += cred[i] * grade[i];
        }
        sgpa = (float)sum / total_cred;
        return sgpa;
    }
}


public class cgpa {
    public static void main(String[] args){
        student s=new student();
        s.accept();
        s.display();
        System.out.println("The sgpa is "+s.sgpa());
    }
}
