import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaDatos extends JFrame{

  private JComboBox<String> tipoDoc;
  private JTextField nombre;
  private JTextField apellido;
  private JTextField edad;
  private JTextField telefono;
  private JTextField nroDoc;

  public VentanaDatos(){
    super("Datos del Formulario");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //panel de Datos
    JPanel jPanelDatos = new JPanel();
    GridLayout gl = new GridLayout(7, 2, 2, 5);
    jPanelDatos.setLayout(gl);
    jPanelDatos.add(new JLabel("Nombre: "));
    nombre = new JTextField(10);
    jPanelDatos.add(nombre);
    jPanelDatos.add(new JLabel(" Apellido: "));
    apellido = new JTextField(10);
    jPanelDatos.add(apellido);
    jPanelDatos.add(new JLabel("Edad: "));
    edad = new JTextField(2);
    jPanelDatos.add(edad);
    jPanelDatos.add(new JLabel("Teléfono: "));
    telefono = new JTextField(10);
    jPanelDatos.add(telefono);
    jPanelDatos.add(new JLabel("Dirección: "));
    jPanelDatos.add(new JTextField(10));
    jPanelDatos.add(new JLabel(" Tipo de documento"));
    tipoDoc = new JComboBox<String>();
    tipoDoc.addItem("Cédula de ciudadanía");
    tipoDoc.addItem("Pasaporte");
    tipoDoc.addItem("Tarjeta de identidad");
    tipoDoc.addItem("Cédula de extranjería");
    jPanelDatos.add(tipoDoc);
    jPanelDatos.add(new JLabel("Número de documento: "));
    nroDoc = new JTextField(10);
    jPanelDatos.add(nroDoc);
    //jPanelDatos.add(new JLabel(" Fecha de nacimiento"));
    //jPanelDatos.add(jPanelFecha);

//  Panel de botones
    JButton boton1 = new JButton("Aceptar");
    JButton boton2 = new JButton("Cancelar");
    JPanel jPanelBtn = new JPanel();
    jPanelBtn.setLayout(new FlowLayout());
    jPanelBtn.add(boton1);
    jPanelBtn.add(boton2);

    Container cp = getContentPane();
    cp.add(jPanelDatos, BorderLayout.CENTER);
    cp.add(jPanelBtn, BorderLayout.SOUTH);

    ManejadorBoton manejadorBtn = new ManejadorBoton();
    boton1.addActionListener(manejadorBtn);
    ManejadorBoton2 manejadorBtn2 = new ManejadorBoton2();
    boton2.addActionListener(manejadorBtn2);
  }
  private class ManejadorBoton implements ActionListener{
    public void actionPerformed(ActionEvent evento){
      JOptionPane.showMessageDialog(VentanaDatos.this,String.format("Nombre: " +nombre.getText() +"\n Apellido: " + apellido.getText() +
      "\n Edad: " + edad.getText() +"\n Telefono: " + telefono.getText() +"\n Tipo de Documento: " + tipoDoc.getSelectedItem()
       + "\n Número de documento: " + nroDoc.getText() + "\n Datos validados correctamente"));
    }
  }
  private class ManejadorBoton2 implements ActionListener{
    public void actionPerformed(ActionEvent evento2){
      JOptionPane.showMessageDialog(VentanaDatos.this,String.format("Está seguro?", evento2.getActionCommand()));
    }
  }
}
