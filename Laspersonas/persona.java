package Laspersonas;
public class persona{
  public String nombre;

  public persona(String nombre){
    this.nombre = nombre;
  }

  public void saludar(){
     System.out.println("Hola me llamo: "+ this.nombre);
  }
  public void mostrarDeudas(){
    System.out.println("Deudas por doquier");
  }
}
