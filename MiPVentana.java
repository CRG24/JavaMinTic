import javax.swing.*;
import java.awt.*;

public class MiPVentana extends JFrame {
    public MiPVentana() {
        super("Añadir usuario");
        setSize(300, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel de fecha
        JPanel jPanelFecha = new JPanel();
        jPanelFecha.setLayout(new FlowLayout());
        jPanelFecha.add(new JTextField(2));
        jPanelFecha.add(new JLabel("/"));
        jPanelFecha.add(new JTextField(2));
        jPanelFecha.add(new JLabel("/"));
        jPanelFecha.add(new JTextField(2));
        jPanelFecha.add(new JLabel("/"));

//    Panel de datos
        JPanel jPanelDatos = new JPanel();
        GridLayout gl = new GridLayout(3, 2, 0, 5);
        jPanelDatos.setLayout(gl);
        jPanelDatos.add(new JLabel(" Nombre"));
        jPanelDatos.add(new JTextField(10));
        jPanelDatos.add(new JLabel(" DNI"));
        jPanelDatos.add(new JTextField(10));
        jPanelDatos.add(new JLabel(" Fecha de nacimiento"));
        jPanelDatos.add(jPanelFecha);

//  Panel de botones

        JPanel jPanelBtn = new JPanel();
        jPanelBtn.setLayout(new FlowLayout());
        jPanelBtn.add(new JButton("Aceptar"));
        jPanelBtn.add(new JButton("Cancelar"));

        Container cp = getContentPane();
        cp.add(jPanelDatos, BorderLayout.CENTER);
        cp.add(jPanelBtn, BorderLayout.SOUTH);

    }

}
