import java.awt.*;
import javax.swing.*;

public class MiVentana2 extends JFrame{
  public MiVentana2(){
    super("Titulo de ventana");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    JLabel etiqueta = new JLabel("Nombre: ");
    JTextField texto = new JTextField(20);
    JButton boton = new JButton("Saludar");
    cp.add(etiqueta);
    cp.add(texto);
    cp.add(boton);
  }
}
