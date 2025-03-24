package Vista;

import Modelo.Modelo;
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        System.out.println("Quiere intentar de nuevo? (s/n): ");
    }

    public char obtenerRespuesta() {
        return scanner.next().toLowerCase().charAt(0);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}
