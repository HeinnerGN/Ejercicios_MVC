package acondicionador_mvc;

import Controlador.Controlador;
import Modelo.Humedad_temp;
import Vista.Vista;

public class Acondicionador_MVC {

    public static void main(String[] args) {
        Humedad_temp modelo = new Humedad_temp(1);
        Vista vista = new Vista();
        Controlador control = new Controlador(modelo, vista);
        control.iniciarproceso();
    }
    
}
