public class AppPrueba{
    public static void main(String args[]){
        Persona unaPersona=new Persona();
        unaPersona.saludar();
        unaPersona.despedirse();
        System.out.println("el valor del atributo nombre es: "+ unaPersona.getNombre());
        unaPersona.setNombre("Juan Carlos");
        System.out.println("el valor del atributo nombre es: "+ unaPersona.getNombre());
        System.out.println("el valor del atributo apellido es: "+ unaPersona.getApellido());
        unaPersona.setApellido("Lopez");
        System.out.println("el valor del atributo apellido es: "+ unaPersona.getApellido());
    }
}
