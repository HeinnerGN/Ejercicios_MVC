package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Modelo[] clientes;
    private Vista vista;

    public Controlador(int numClientes, Vista vista) {
        this.clientes = new Modelo[numClientes];
        this.vista = vista;
        for (int i = 0; i < numClientes; i++) {
            clientes[i] = new Modelo();
        }
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            for (Modelo cliente : clientes) {
                cliente.procesarDatos();
                vista.mostrarMensaje(cliente.getMensaje());
            }

            vista.mostrarMenu();
            char respuesta = vista.obtenerRespuesta();
            if (respuesta == 's') {
                for (Modelo cliente : clientes) {
                    cliente.procesarDatos();
                }
            }
            else {
                vista.mostrarMensaje("Saliendo del programa...");
                continuar = false;
            }
        }
    }
}
