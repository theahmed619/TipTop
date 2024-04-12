class Multi implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class MultiT2 extends Multi {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            Multi mul=new Multi();
            Thread obj=new Thread(mul);
            obj.start();
        }
    }
    
}
