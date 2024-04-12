import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class GUI3 extends JFrame implements KeyListener {
    JLabel l1;
    JTextArea t1;

    GUI3() {
        l1 = new JLabel();
        t1 = new JTextArea();
        setLayout(null);
        add(l1);
        add(t1);
        l1.setBounds(150, 200, 100, 50);
        t1.setBounds(100, 280, 200, 100);
        t1.addKeyListener(this);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("Pressed...");

    }

    public void keyReleased(KeyEvent e) {
        l1.setText("Released..");
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("Typing...");
    }

    public static void main(String[] args) {
        GUI3 g3 = new GUI3();
    }

}
