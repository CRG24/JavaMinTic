import Laspersonas.estudiante;
import Laspersonas.empleado;
import Laspersonas.trabajadorindependiente;
import Laspersonas.persona;

public class AppPersonas{
   public static void main(String args[]){
     estudiante estudiante1 = new estudiante("Christian", "UTB");
     //estudiante1.saludar();
     //estudiante1.mostrarDeudas();

     empleado empleado1 = new empleado("José", 25);
     //empleado1.saludar();
     //empleado1.mostrarDeudas();

     trabajadorindependiente trabajador = new trabajadorindependiente("Carmen", "Ventas");
     //trabajador.saludar();
     //trabajador.mostrarDeudas();
     persona arrayPersonas[] = new persona[3];

     arrayPersonas[0] = estudiante1;
     arrayPersonas[1] = empleado1;
     arrayPersonas[2] = trabajador;

     for (int i = 0; i<arrayPersonas.length; i++){
       arrayPersonas[i].saludar();
       arrayPersonas[i].mostrarDeudas();
     }
   }
}
