import java.util.*;

public class stack {
     int size = 10;
    int[] s = new int[10];
    int item,top=-1;

     void push(int item)
    {
        if(top == size)
            System.out.println("Stack is full .. ");
        else {
            top++;
            s[top] = item;
        }
    }

    int pop(){
        if(top == -1)
            return -1;
        else{
            return s[top--];
        }
    }

    void display(){
        int i;
        System.out.println("The contents of the stacks are : ");
        for(i=0;i<=top;i++)
            System.out.println(s[i]);
    }

    public static void main(String[] args) {
        int choice,item;
        stack obj=new stack();
        Scanner sc = new Scanner(System.in);
        for(;;){
        System.out.println("Enter the choice : ");
        System.out.println("1:PUSH 2:POP 3:DISPLAY 4:EXIT");
        choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the item to be inserted : ");
                item = sc.nextInt();
                obj.push(item);
                break;

            case 2:
                item = obj.pop();
                if (item == -1)
                    System.out.println("Stack is empty.");
                else
                    System.out.println("The deleted item is " + item);
                break;

            case 3:
                obj.display();
                break;

            case 4:System.exit(0);
                break;
        }
        }
    }
}
