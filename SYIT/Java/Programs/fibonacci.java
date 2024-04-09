import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n;
        System.out.println("Enter the Number: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print(a + ",");
            int c = a + b;
            a = b;
            b = c;


        }
        obj.close();
    }
}
/*lass Main {
    public static void main(String[] args) {

        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}*/