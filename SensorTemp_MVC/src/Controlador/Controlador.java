package Controlador;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciar() {
        boolean continuar = true;
        
        while (continuar) {
            modelo.generarTemperaturas();
            vista.mostrarTemp(modelo.getTemperaturas());
            continuar = vista.repetirProce();
        }
        
        vista.salir();
    }
}
