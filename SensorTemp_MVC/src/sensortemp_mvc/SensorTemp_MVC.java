package sensortemp_mvc;

import Modelo.Modelo;
import Vista.Vista;
import Controlador.Controlador;

public class SensorTemp_MVC {

    public static void main(String[] args) {
        Modelo modelo = new Modelo(5);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
    
}
