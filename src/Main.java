import javax.swing.*;
import java.awt.Color;
import java.awt.Container;

public class Main {

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Primera Ventana");
        f.setSize(300,300);
        f.setLocation(200,100);
        f.setBackground(Color.cyan);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        Container panelPrincipal = f.getContentPane();

        panelPrincipal.setBackground(Color.GREEN);

        panelPrincipal.setLayout(null);
        JLabel label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        panelPrincipal.add(label1);

        f.setVisible(true);
    }
}









