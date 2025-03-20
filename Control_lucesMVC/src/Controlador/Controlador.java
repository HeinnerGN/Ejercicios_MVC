package Controlador;

import Modelo.Luces;
import Vista.Casa;
import java.util.ArrayList;

public class Controlador {
    private Luces luces;
    private Casa casa;

    public Controlador(Luces luces, Casa casa) {
        this.luces = luces;
        this.casa = casa;
    }

    public void Empezar() {
       String mensaje = luces.Datos();
       casa.mostrarLuz(mensaje);
    }
}
