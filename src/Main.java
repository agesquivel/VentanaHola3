import javax.swing.JFrame;
import java.awt.Color;

public class Main {


    public static void main(String[] args)
    {
        JFrame f = new JFrame("Primera Ventana");
        f.setSize(300,300);
        f.setLocation(200,100);
        f.setBackground(Color.cyan);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.GREEN);
        f.setVisible(true);
    }
}
