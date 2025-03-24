package Vista;

import Modelo.Asiento;
import java.util.Scanner;

public class Vista {

    private Scanner dato;

    public Vista() {
        this.dato = new Scanner(System.in);
    }

    public void mostrarAsientos(Asiento[] asientos) {
        System.out.println("Asientos disponibles:");
        for (Asiento asiento : asientos) {
            if (!asiento.isReservado()) {
                System.out.print(asiento.getNumero() + " ");
            }
        }
        System.out.println();
    }

    public String pedirNombre() {
        System.out.println("Ingrese nombre: ");
        return dato.nextLine();
    }

    public int pedirAsiento() {
        System.out.print("Elige el numero de asiento que deseas reservar: ");
        return dato.nextInt();
    }

    public void mostrarReservaExitosa(int asiento) {
        System.out.println("Reserva exitosa para el asiento " + asiento);
    }

    public void mostrarReservaFallida() {
        System.out.println("No se pudo realizar la reserva.");
    }

    public void mostrarMensajeSalida() {
        System.out.println("Saliendo.");
    }

    public boolean preguntarContinuar() {
        System.out.print("Quieres continuar? (si/no): ");
        String respuesta = dato.next().toLowerCase();
        return respuesta.equals("si");
    }

    public void cerrarScanner() {
        dato.close();
    }
}
