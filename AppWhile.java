import java.util.Scanner;
public class AppWhile{
  public static void main(String args[]){
    double ahorro = 0;
    boolean continuar = true;
    double moneda;
    Scanner lector = new Scanner(System.in);

    while (continuar == true){
      System.out.println("Digite el valor de la moneda");
      moneda = lector.nextDouble();
      ahorro = ahorro + moneda;
      System.out.println("Desea continuar true/false?");
      continuar = lector.nextBoolean();
    }

  }
}
