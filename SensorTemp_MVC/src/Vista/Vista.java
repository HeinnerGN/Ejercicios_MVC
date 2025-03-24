package Vista;

import java.util.Scanner;

public class Vista {
    
    public void mostrarTemp(double[] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            double temp = temperaturas[i];
            if (temp < 10) {
                System.out.println("Temperatura: " + temp + " C - Encendiendo el calefactor.");
            } else if (temp >= 10 && temp <= 25) {
                System.out.println("Temperatura: " + temp + " C - Sistema inactivo.");
            } else {
                System.out.println("Temperatura: " + temp + " C - Encendiendo el ventilador.");
            }
        }
    }

    public boolean repetirProce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quiere continuar? (si/no): ");
        String resp = scanner.next().toLowerCase();
        return resp.equals("si");
    }
    
    // Mostrar mensaje de salida
    public void salir() {
        System.out.println("Saliendo.");
    }
}
