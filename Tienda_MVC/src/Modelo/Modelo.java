package Modelo;

import java.util.Random;

public class Modelo {
    private int memb;
    private int hora;
    private String mensaje;

    public Modelo() {
        Random random = new Random();
        this.memb = random.nextInt(3) + 1;
        this.hora = random.nextInt(24) + 1;
    }

    public int getMemb() {
        return memb;
    }

    public int getHora() {
        return hora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void procesarDatos() {
        if (this.memb == 1 && this.hora >= 8 && this.hora <= 20) {
            mensaje = "Acceso para el cliente con membresia.";
        } else if (this.memb == 2 && this.hora >= 8 && this.hora <= 20) {
            mensaje = "Acceso para cliente empleado.";
        } else {
            mensaje = "El cliente no tiene acceso.";
        }
    }
}
