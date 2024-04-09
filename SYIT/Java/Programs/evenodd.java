import java.util.Scanner;

public class evenodd {
    public static void main(String[] args)
    {
        int a;
        System.out.println("Enter the Number: ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();

        if(a%2==0)

            System.out.println("Even Number. ");

        else
            System.out.println("Odd Number. ");

        obj.close();

    }
}
