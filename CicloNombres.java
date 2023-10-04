import java.util.Scanner;
public class CicloNombres{
  public static void main (String args[]){
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de personas");
    int n = lector.nextInt();
    String Nombres[] = new String[n];
    lector = new Scanner(System.in);
    for (int i=0;i<n;i++){
      System.out.println("Digite el nombre de cada persona");
      String nombre = lector.nextLine();
      Nombres[i] = nombre;
    }
    for (int i=0;i<n;i++){
      System.out.println("El nombre de la persona en la posición"+ i +"es :"+Nombres[i]);
    }
  }
}
