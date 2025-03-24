package Modelo;

public class Cine {
    private Asiento[] asientos;
    private int capacidad;

    public Cine(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento(i + 1);
        }
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public boolean reservarAsiento(int numeroAsiento, Usuario usuario) {
        if (numeroAsiento < 1 || numeroAsiento > capacidad) {
            return false;
        }

        Asiento asiento = asientos[numeroAsiento - 1];
        if (asiento.isReservado()) {
            return false;
        }

        asiento.reservar();
        usuario.reservarAsiento(numeroAsiento);
        return true;
    }

    public boolean hayEspacioDisponible() {
        for (Asiento asiento : asientos) {
            if (!asiento.isReservado()) {
                return true;
            }
        }
        return false;
    }
}
