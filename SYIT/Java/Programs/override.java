class Demo{
    void fun(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
}
public class override extends Demo {
    void fun(int a,int b)
    {
        super.fun(1,1);
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        override r1=new override();
        r1.fun(2, 2);
    }
    
}
