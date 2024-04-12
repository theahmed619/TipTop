import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
       int  a=0;
        int b=1;
        System.out.println("Enter Nth term: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++)
        {
           int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
