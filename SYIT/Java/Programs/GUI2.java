import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

class Demo extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1;

    Demo() {
        t1 = new JTextField();
        b1 = new JButton("Click");

        setLayout(null);

        add(t1);
        add(b1);
        t1.setBounds(150, 100, 100, 50);
        b1.setBounds(220, 200, 60, 40);
        b1.addActionListener(this);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        t1.setText("Hello");
    }

}

public class GUI2 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
    }

}
