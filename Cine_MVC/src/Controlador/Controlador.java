package Controlador;

import Modelo.Cine;
import Modelo.Usuario;
import Modelo.Asiento;
import Vista.Vista;

public class Controlador {

    private Cine cine;
    private Vista vista;

    public Controlador(Cine cine, Vista vista) {
        this.cine = cine;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        String nombre = vista.pedirNombre();
        Usuario usuario = new Usuario(nombre);

        while (continuar) {
            vista.mostrarAsientos(cine.getAsientos());

            int asiento = vista.pedirAsiento();

            if (cine.reservarAsiento(asiento, usuario)) {
                vista.mostrarReservaExitosa(asiento);
            } else {
                vista.mostrarReservaFallida();
            }

            continuar = vista.preguntarContinuar();
        }
        vista.mostrarMensajeSalida();
        vista.cerrarScanner();
    }
}
