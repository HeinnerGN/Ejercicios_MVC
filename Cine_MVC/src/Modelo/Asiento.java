package Modelo;

public class Asiento {
    private int numero;
    private boolean reservado;
    
    public Asiento(int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        this.reservado = true;
    }

    public void liberar() {
        this.reservado = false;
    }
}
