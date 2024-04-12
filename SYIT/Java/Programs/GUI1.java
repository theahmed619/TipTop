import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;

class Demo {
    JFrame f1;
    JTextField t1,t2;
    JLabel l1,l2;
    JButton b1,b2;
    Demo()
    {
        f1=new JFrame("Welcome");
        t1=new JTextField();
        t2=new JTextField();
        l1=new JLabel("Username: ");
        l2=new JLabel("Password: ");
        b1=new JButton();
        b2=new JButton();

        f1.setLayout(null);
        f1.add(t1); f1.add(t2); f1.add(l1); f1.add(l2); f1.add(b1); f1.add(b2);
        
        l1.setBounds(100, 100, 80, 50);
        l2.setBounds(100, 150, 80, 50);
        t1.setBounds(200, 100, 100, 50);
        t2.setBounds(200, 150, 100, 50);
        b1.setBounds(220, 300, 60, 40);
        f1.setSize(500, 500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class GUI1{
    public static void main(String[] args) {
        Demo d1=new Demo();
    }
}