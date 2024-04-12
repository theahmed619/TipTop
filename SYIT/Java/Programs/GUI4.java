import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GUI4 extends JFrame implements MouseListener {
    JLabel l1;
    JTextArea t1;

    GUI4() {
        l1 = new JLabel();
        t1 = new JTextArea();
        setLayout(null);
        add(l1);
        add(t1);
        l1.setBounds(150, 200, 100, 50);
        addMouseListener(this);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mousePressed(MouseEvent e) {
        l1.setText("Pressed...");

    }

    public void mouseReleased(MouseEvent e) {
        l1.setText("Released..");
    }

    public void mouseExited(MouseEvent e) {
        l1.setText("Exit...");
    }
    public void mouseEntered(MouseEvent e)
    {
        l1.setText("Entering...");
    }
    public void mouseClicked(MouseEvent e)
    {
        l1.setText("Clicked");
    }

    public static void main(String[] args) {
        GUI4 g4 = new GUI4();
    }

}
