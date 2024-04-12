import java.util.Scanner;

public class ArrMax {
    public static void main(String[] args) {
        int a[]=new int[3];
        int max=a[0];
        System.out.println("Enter Array: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
