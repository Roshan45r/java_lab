import java.util.*;

class book{
    String title;
    String author;
    int price;
    int numberofpages;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title : ");
        title = sc.next();
        System.out.println("Enter the author name : ");
        author = sc.next();
        System.out.println("Enter the price : ");
        price = sc.nextInt();
        System.out.println("Enter the number of pages : ");
        numberofpages = sc.nextInt();
    }

    void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author:"+author);
        System.out.println("Price: "+price);
        System.out.println("Number of pages:"+numberofpages);
    }
}

class books{
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books ");
        int n= sc.nextInt();
        book[] b = new book[n];
        for(i=0;i<n;i++)
        {
            b[i] = new book();
            System.out.println("Enter the details of the book.");
            b[i].accept();
        }
        System.out.println("Details of books entered : ");
        for(i=0;i<n;i++)
            b[i].display();
    }
}
