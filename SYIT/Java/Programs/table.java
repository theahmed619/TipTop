import java.util.Scanner;

public class table {
    public static void main(String[] args)
    {
        int a,i=1;
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
        for(i=1;i<=10;i++)
        {
        System.out.println(a+"*"+i+"="+a*i);
        }
        
    }
}
