import java.util.Scanner;
import java.lang.Math;
class bank
{
    String name;
    int acc_no;
    float bal,si;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the name of the account holder:");
        name=sc.nextLine();
        System.out.println("Enter the account number:");
        acc_no=sc.nextInt();
        System.out.println("Enter the account balance:");
        bal=sc.nextFloat();
    }
    void display()
    {
        System.out.println();
        System.out.println("Details:");
        System.out.println("Name:"+name+"\nAccount number:"+acc_no+"\nbalance:"+bal);
    }
    void deposits()
    {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nDo you want to deposit(1 for yes,2 for no):");

        int d=sc.nextInt();
        if(d==1)
        {
            System.out.println("Enter the amount to be deposited:");
            int amt=sc.nextInt();
            bal=bal+amt;
            System.out.println("Available balance="+bal);
        }
    }
}
class current extends bank
{
    float sercharge=100;
    void cheque()
    {
        System.out.println("\nCheque service available");
    }
    void withdraw()
    {
        float amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Minimum balance is Rs.1000");
        System.out.println("Enter amount to be withdrawn");
        amount=sc.nextFloat();
        if(amount>bal)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            bal=bal-amount;
            if(bal<1000)
            {
                bal=bal-sercharge;
                System.out.println("Service charge of Rs.100 is deducted");
                System.out.println("Available balance:"+bal);
            }
            else
            {
                System.out.println("Withdrawn"+amount);
                System.out.println("Available balance"+bal);
            }
        }
    }
}
class savings extends bank
{
    void cheque()
    {
        System.out.println("No cheque services");
    }
    void simint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rate");
        int r=sc.nextInt();
        System.out.println("Enter time elapse period");
        int t=sc.nextInt();
        System.out.println("Enter no of times");
        int n=sc.nextInt();
        si=bal*(1+r/n);
        System.out.println("Interest is"+(Math.pow(si,(n*t))));
    }
    void withdraw()
    {
        float amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("No min balance");
        System.out.println("Enter amount to be withdrawn");
        amount=sc.nextFloat();
        if(amount>bal)
        {
            System.out.println("Balance insufficient");
        }
        else
        {
            bal=bal-amount;
            System.out.println("Withdrawn"+amount);
            System.out.println("Available balance:"+bal);
        }
    }
}
class MainClass
{
    public static void main(String args[])
    {
        savings ob1=new savings();
        current ob2=new current();
        System.out.println("1.Savings\n2.Current");
        System.out.println("Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:ob1.accept();
                ob1.display();
                ob1.cheque();
                ob1.deposits();
                ob1.simint();
                ob1.withdraw();
                break;
            case 2:ob2.accept();
                ob2.display();
                ob2.cheque();
                ob2.deposits();
                ob2.withdraw();
                break;
            default:System.out.println("Invalid choice");
                break;
        }
    }
}
