public class MultiT1 extends Thread {
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            MultiT1 m1=new MultiT1();
            m1.start();
        }
    }
    
}
