public class Persona{
    private String nombre="Christian";
    public String apellido="Giron";
    public int edad;
    public int telefono;

    public String getNombre(){
      return this.nombre;
    }

    public String getApellido(){
      return this.apellido;
    }

    public void setApellido(String lastname){
      this.apellido = lastname;
    }

    public void setNombre(String name){
      this.nombre = name;
    }

    public void saludar(){
        System.out.println("Hola me llamo: " + this.nombre );
    }//cierre de la funcion saludar


    public void despedirse(){
        System.out.println("me voy Adios");
    }//cierre de la funcion despedirse
}//cierra la clase
