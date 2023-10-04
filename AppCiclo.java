import java.util.Scanner;
public class AppCiclo{
   public static void main(String args[]){
      String Frutas[] = new String[3];

     //Llenar manualmente
     //Frutas[0] = "Mango";
     //Frutas[1] = "Pera";
     //Frutas[2] = "Manzana";
        Scanner lector = new Scanner(System.in);
        for (int i=0;i<3;i++){
           System.out.println("Digite el nombre de la fruta");
           String nombreFruta = lector.nextLine();
           Frutas[i] = nombreFruta;
        }

    // int c = 0;
     //while (c<3){
       //System.out.println("En la posición: "+ c + "y su valor es:" +Frutas[c]);
       //c++;
     //}

     for (int i=0;i<3;i++){
        System.out.println("En la posición: "+ i + "y su valor es:" +Frutas[i]);
        System.out.println("--------------------------------");
     }
   }
}
