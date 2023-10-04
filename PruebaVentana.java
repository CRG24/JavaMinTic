import javax.swing.JFrame;
public class PruebaVentana{
  public static void main (String arg[]){
    //crear el objeto de tipo VentanaFrame
    VentanaFrame marcoVentana = new VentanaFrame();
    //configurar el botón cerrar
    marcoVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //dar dimensiones a la ventana
    marcoVentana.setSize(275,210);
    //hacer visible la ventana
    marcoVentana.setVisible(true);
  }
}
