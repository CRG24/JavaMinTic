import javax.swing.*;
//import javax.swing.JFrame;

public class VentanaTest{
  public static void main(String[] args){
    JFrame f = new JFrame("Datos del Formulario");
    //MiVentana2 ventana = new MiVentana2();
    //MiPVentana ventana = new MiPVentana();
    VentanaDatos ventana = new VentanaDatos();
    //MiVentana ventana = new MiVentana();
    ventana.setSize(300, 300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
  }
}
