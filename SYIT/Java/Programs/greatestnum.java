import java.util.Scanner;

public class greatestnum {
    public static void main(String[] args) {
        int a,b,c; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1: ");
            a=sc.nextInt();
        System.out.println("Enter Num2: ");
            b=sc.nextInt();
        System.out.println("Enter Num3: ");
            c=sc.nextInt();  
if(a>=b && a>=c)  
System.out.println(a+" is the largest Number");  
//comparing b with a and b with c  
//if both conditions are true, prints b  
else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");  
else  
//prints c if the above conditions are false  
System.out.println(c+" is the largest number"); 
sc.close();  
    }
}
