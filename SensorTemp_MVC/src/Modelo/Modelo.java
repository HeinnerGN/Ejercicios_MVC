package Modelo;

import java.util.Random;

public class Modelo {
    private double[] temperaturas;
    
    public Modelo(int cantidad) {
        temperaturas = new double[cantidad];
    }
    
    public void generarTemperaturas() {
        Random random = new Random();
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = 5 + (35 * random.nextDouble());
        }
    }
    
    public double[] getTemperaturas() {
        return temperaturas;
    }
}
