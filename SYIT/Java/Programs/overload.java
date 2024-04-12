public class overload {
    void hell(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void hell(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        overload o1=new overload();
        o1.hell(2, 2);
        o1.hell("Ahmy");
    }
}
