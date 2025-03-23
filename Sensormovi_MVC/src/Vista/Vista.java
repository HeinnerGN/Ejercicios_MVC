package Vista;

import Modelo.Alarma;
import java.util.Scanner;

public class Vista {
    private Scanner dato;
    
    public Vista() {
        dato = new Scanner(System.in);
    }

    public int menuAlarma() {
        System.out.println("Sistema de seguridad - Deteccion de intrusos");
        System.out.println("1. Activar / Desactivar alarma");
        System.out.println("2. Lectura de sensores");
        System.out.println("3. Salir");
        System.out.println("Elige una opcion:");
        return dato.nextInt();
    }

    public char opcion() {
        System.out.print("Quieres activar o desactivar la alarma? (activar/desactivar): ");
        char user = dato.next().toLowerCase().charAt(0);
        return user;
    }

    public void estadoSensor(boolean[] sensores) {
        for (int i = 0; i < sensores.length; i++) {
            System.out.println("Sensor " + (i + 1) + " detecto movimiento: " + sensores[i]);
        }
    }

    public void estadoAlarma(Alarma alarma) {
        if (alarma.estaActivada()) {
            System.out.println("Alarma activada: Intrusos detectados.");
        } else {
            System.out.println("La alarma no ha detectado nada.");
        }
    }

    public boolean continuarProceso() {
        System.out.print("Quieres continuar? (s/n): ");
        String respuesta = dato.next().toLowerCase();
        return respuesta.equals("s");
    }

    public void cerrarScanner() {
        dato.close();
    }
}
