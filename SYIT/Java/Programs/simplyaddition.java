import java.util.Scanner;

public class simplyaddition {
    public static void main(String[] args)
    {
        int a,b,c;
        System.out.println("Enter the Numbers: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.print("Total is = "+c);
        s.close();
    }
}
