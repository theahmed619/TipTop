import javax.swing.JOptionPane;

public class dialogbox 
{
    public static void main(String main[])
    {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter NUM1: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter NUM2: "));
        int c=a+b;
        JOptionPane.showMessageDialog(null, "Total= "+c);
    }    
}
