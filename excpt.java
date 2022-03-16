class WrongAge extends Exception{
    WrongAge(String e){
        super(e);
    } 
}


class Father{
    int fage;

    Father(int fage) throws WrongAge{
        if(fage<0)
            throw new WrongAge("Fathers age cant be negative");

        this.fage = fage;
    }

}

class Son extends Father{
    int sage;

    Son(int fage,int sage) throws WrongAge{
        super(fage);

        if(fage<=sage)
            throw new WrongAge("Father can not be younger than son.");
        this.sage = sage;
    }
}

class excpt{
    public static void main(String[] args){
        try{
            Son s = new Son(0,2);
        }

        catch (WrongAge e){
            System.out.println(e);

        }

        try{
            Son s1 = new Son(-1,5);
        }

        catch (WrongAge e){
            System.out.println(e);

        }
    }
}
