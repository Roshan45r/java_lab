import java.util.Scanner;

class complexmethod{
    float r,e;

    complexmethod(float r,float e){
        this.r = r;
        this.e = e;
    }

    complexmethod add(complexmethod a){
        float resr,rese;
        resr = this.r + a.r;
        rese = this.e + a.e;
        complexmethod res = new complexmethod(resr,rese);
        return res;
    }

    complexmethod sub(complexmethod a){
        float resr,rese;
        resr = this.r - a.r;
        rese = this.e - a.e;
        complexmethod res = new complexmethod(resr,rese);
        return res;
    }

    String tostring() {
        return this.r + " + i " + this.e;
    }
}

public class complex {
    public static void main(String[] args) {
        float r1,e1,r2,e2;
        complexmethod a,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real and imaginary part of first number : ");
        r1 = sc.nextFloat();
        e1 = sc.nextFloat();
        complexmethod complex1 = new complexmethod(r1,e1);
        System.out.println(complex1.tostring());
        System.out.println("Enter the real and imaginary part of second number : ");
        r2 = sc.nextFloat();
        e2 = sc.nextFloat();
        complexmethod complex2 = new complexmethod(r2,e2);
        System.out.println(complex2.tostring());
        a = complex1.add(complex2);
        System.out.println("The value after addition is : "+a.tostring());
        s = complex1.sub(complex2);
        System.out.println("The value after subtraction is : "+s.tostring());
    }
}
