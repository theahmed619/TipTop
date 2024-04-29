import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

class calci extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JLabel l1,l2;
    JButton b1,b2;
    calci()
    {
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        l1=new JLabel("NUM1: ");
        l2=new JLabel("NUM2: ");

        b1=new JButton("ADD");
        b2=new JButton("CLEAR");

        setLayout(null);
        
        add(t1); add(t2); add(t3); add(l1);
        add(l2); add(b1); add(b2);

        l1.setBounds(100, 50,50 , 50);
        l2.setBounds(100, 90,50 , 50);

        t1.setBounds(200, 50,100 , 40);
        t2.setBounds(200, 100,100 , 40);
        t3.setBounds(150, 190, 150, 50);


        b1.setBounds(150, 250,80 , 50);
        b1.addActionListener(this);
        b2.setBounds(240, 250,80 , 50);
       


        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try{
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int sum=num1+num2;
        String str=String.valueOf(sum);
        t3.setText(str);
        } catch(Exception e1)
        {
            System.out.println("Enter Numbers only");
        }
        
    }
}
public class GUICalci {
    public static void main(String[] args) {
        calci c1=new calci();
    }
}