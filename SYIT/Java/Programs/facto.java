import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        int f=1;
        System.out.println("Enter Num: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}
