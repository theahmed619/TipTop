import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        int a []=new int [3];

        System.out.println("Enter Array: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for(int b:a)
        {
            System.out.println(b);
        }
        System.out.println();
    }
}
