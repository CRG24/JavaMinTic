import java.util.Scanner;

public class AppPrueba{
      public static void main (String args[]){
      scanner teclado = new scanner(System.in);
      String nombre;
      String apellido;
      int edad;
      int telefono;
      System.out.println("Ingrese su nombre");
      nombre = teclado.nextLine();
      System.out.println("Ingrese su apellido");
      apellido = teclado.nextLine();
      System.out.println("Ingrese su edad");
      edad = teclado.nextInt();
      System.out.println("Ingrese su telefono");
      telefono = teclado.nextInt();

      Persona unaPersona = new Persona(nombre,apellido,edad,telefono);
      unaPersona.saludar();
      unaPersona.despedirse();
    }
}
