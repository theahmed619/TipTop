import javax.swing.JOptionPane;

public class factorial 
{
public static void main(String[] args){
    int fact=1;
    int n=Integer.parseInt(JOptionPane.showInputDialog("Enter the Term: "));
    for(int i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    JOptionPane.showMessageDialog(null,"Factorial is = "+ fact);

}
}
