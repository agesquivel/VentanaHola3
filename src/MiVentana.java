import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame{

    public MiVentana(String titulo, Color colorfondo) {
        this.setTitle(titulo);
        Container panelPrincipal = this.getContentPane();

        panelPrincipal.setBackground(colorfondo);
        panelPrincipal.setLayout(null);
        JLabel label1=new JLabel("Hola Mundo.");
        label1.setBounds(10,20,200,30);
        panelPrincipal.add(label1);
    }

    public static void main(String[] args)
    {
        MiVentana f = new MiVentana("Primera Ventana", Color.green);
        f.setSize(300,300);
        f.setLocation(200,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
    }
}









