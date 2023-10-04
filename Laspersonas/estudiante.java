package Laspersonas;
public class estudiante extends persona {
  public String nombreUniversidad;

  public estudiante(String nombre, String nombreUniversidad){
    super(nombre);
    this.nombreUniversidad = nombreUniversidad;
  }

  public void mostrarNombreUniversidad(){
    this.saludar();
    System.out.println("El nombre de la universidad en la que estudió es: "+ this.nombreUniversidad);
  }

@Override
public void mostrarDeudas(){
  System.out.println("Soy estudiante, no tengo deudas");
   }
}
