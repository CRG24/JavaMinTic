package Laspersonas;
public class trabajadorindependiente extends persona{
  public String tipoNegocio;

  public trabajadorindependiente(String nombre, String tipoNegocio){
    super(nombre);
    this.tipoNegocio = tipoNegocio;
  }

  public void mostrarTipoNegocio(){
    this.saludar();
    System.out.println("El tipo de negocio que tengo es:" + this.tipoNegocio);
  }
  @Override
  public void mostrarDeudas(){
    System.out.println("Soy trabajador y tengo una deuda de 9 millones");
  }
}
