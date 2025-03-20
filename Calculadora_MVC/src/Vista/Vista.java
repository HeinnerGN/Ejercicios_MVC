package Vista;

import java.util.Scanner;


public class Vista {
    private Scanner dato = new Scanner(System.in);
    
    public int pedirnum(String mensaje){
        System.out.println(mensaje);
        return dato.nextInt();
    }
    
    public String pedirOperacion(){
        System.out.println("Elija la operacion que desea realizar (sumar, restar, multiplicar, dividir):");
        return dato.next().toLowerCase();
    }
    
    public void Mostrarinfo(int result){
        System.out.println("El resultado de la operacion es: " + result);
    }
    
    public void mostrarError(String mensaje){
        System.out.println(mensaje);
    }
    
    public boolean repetir(){
        System.out.println("Quiere hacer otra operacion? (si/no): ");
        String opc = dato.next().toLowerCase();
        return opc.equals("si");
    }
    
    public void fuera(){
        System.out.println("Saliendo del programa...");
    }
}

