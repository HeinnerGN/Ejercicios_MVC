package Modelo;

public class Alarma {
    private boolean alarmaActivada;
    
    public Alarma() {
        alarmaActivada = false;
    }
    
    public void activar() {
        alarmaActivada = true;
    }

    public void desactivar() {
        alarmaActivada = false;
    }
    
    public boolean estaActivada() {
        return alarmaActivada;
    }
}
