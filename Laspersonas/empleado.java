package Laspersonas;
public class empleado extends persona{
  public int tiempoLaborado;

  public empleado(String nombre, int tiempoLaborado){
    super(nombre);
    this.tiempoLaborado = tiempoLaborado;
  }

  public void mostrarTiempoLaborado(){
    this.saludar();
    System.out.println("Los años que lleva en la empresa son: "+ this.tiempoLaborado);
  }
  @Override
  public void mostrarDeudas(){
    System.out.println("Soy empleado y tengo deuda de 800 mil");
  }
}
