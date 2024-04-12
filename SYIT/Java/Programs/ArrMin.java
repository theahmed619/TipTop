import java.util.Scanner;

public class ArrMin {
    public static void main(String[] args) {
        int a[]=new int[3];
       
        System.out.println("Enter Array: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<3;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);

    }
}