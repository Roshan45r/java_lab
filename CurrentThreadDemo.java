class CurrentThreadDemo{
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("Currentthread:"+t);
        //changethenameofthethread
        t.setName("MyThread");
        System.out.println("Afternamechange:"+t);
        try{
            for(int n=5;n>0;n--){
                System.out.println(n);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Mainthreadinterrupted");
        }
    }
}
