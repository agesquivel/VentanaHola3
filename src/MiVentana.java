import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame{

    private JButton btnAceptar;

    public MiVentana(String titulo, Color colorfondo) {
        this.setTitle(titulo);
        Container panelPrincipal = this.getContentPane();

        panelPrincipal.setBackground(colorfondo);
        panelPrincipal.setLayout(null);

        JLabel lblUsr = new JLabel("Usuario: ");
        lblUsr.setBounds(10,20,100,30);
        panelPrincipal.add(lblUsr);
        JTextField edtUsr = new JTextField();
        edtUsr.setBounds(120, 20, 150, 30);
        panelPrincipal.add(edtUsr);

        JLabel lblClave = new JLabel("Contraseña: ");
        lblClave.setBounds(10,60,100,30);
        panelPrincipal.add(lblClave);
        JTextField edtClave = new JTextField();
        edtClave.setBounds(120, 60, 150, 30);
        panelPrincipal.add(edtClave);

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(40, 100, 100, 30);
        panelPrincipal.add(btnAceptar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(150, 100, 100, 30);
        panelPrincipal.add(btnCancelar);

        //Creación de objetos oyentes
        AccionBoton oyenteBtnAceptar = new AccionBoton();
        AccionBoton oyenteBtnCancelar = new AccionBoton();

        //Vincular los oyentes a los objetos que generan el evento
        btnAceptar.addActionListener(oyenteBtnAceptar);
        btnCancelar.addActionListener(oyenteBtnCancelar);
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

    //Declaración de clase interna
    class AccionBoton implements ActionListener {

        //Método controlador del evento ActionEvent
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Haz presionado el botón "
                    + ((JButton) e.getSource()).getText() );

            if ((JButton) e.getSource() == btnAceptar)
                System.out.println("Presionaste el botón Aceptar");
            else System.out.println("Presionaste el botón Cancelar");
        }
    } //Class AccionBoton
} //Class MiVentana





















