import java.awt.FlowLayout;    //Especifica la forma en que se van a incluir los controles
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField; //Control casilla de contraseña
import javax.swing.JButton; //Control tipo botón
import javax.swing.JOptionPane; //Muestra ventanas con mensajes
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFrame extends JFrame{
  private JLabel etiqueta;
  private JTextField campoTexto;
  private JPasswordField campoContrasena;
  private JButton botonSimple;

  public VentanaFrame(){
    super("Prueba de interfaz gráfica");
    setLayout(new FlowLayout()); //establece la forma como se van a ir agregando los controles

    //Imagen icono
    Icon insecto = new ImageIcon(getClass().getResource("Insecto1.gif"));
    //Crear el label como imagen y ubicarla a la izquierda
    etiqueta = new JLabel("Etiqueta e icono",insecto,SwingConstants.LEFT);
    etiqueta.setToolTipText("Esta es una etiqueta");
    add(etiqueta);
    //crear el campo de text
    campoTexto = new JTextField("Escribe aquí");
    add(campoTexto); //agregar la casilla de texto a la ventana
    // crear el campo de JPasswordField
    campoContrasena = new JPasswordField("texto oculto");
    add(campoContrasena);
    //crear el botón
    botonSimple = new JButton("Botón simple");
    add(botonSimple);

    ManejadorCampoTexto manejadorTxt = new ManejadorCampoTexto();
    //agregar el evento de escucha al campotexto
    campoTexto.addActionListener(manejadorTxt);
    //agregar el evento de escucha al campo contraseña
    campoContrasena.addActionListener(manejadorTxt);

    ManejadorBoton manejadorBtn = new ManejadorBoton();
    botonSimple.addActionListener(manejadorBtn);
  }

private class ManejadorCampoTexto implements ActionListener{

  public void actionPerformed(ActionEvent evento){
    String cadena = "";

    if(evento.getSource()==campoTexto)
    cadena = String.format("campoTexto: %s",evento.getActionCommand());
    else if (evento.getSource()==campoContrasena)
    cadena = String.format("campoTexto: %s", new String(campoContrasena.getPassword()));
    JOptionPane.showMessageDialog(null,cadena);
  }
}

private class ManejadorBoton implements ActionListener{
  public void actionPerformed(ActionEvent evento){
    JOptionPane.showMessageDialog(VentanaFrame.this,String.format("usted imprimió %s", evento.getActionCommand()));
  }
}
}
