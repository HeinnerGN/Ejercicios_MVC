package Modelo;

public class Usuario {
    private String nombre;
    private int asientoReserva;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.asientoReserva = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAsientoReserva() {
        return asientoReserva;
    }

    public void reservarAsiento(int asiento) {
        this.asientoReserva = asiento;
    }
}
