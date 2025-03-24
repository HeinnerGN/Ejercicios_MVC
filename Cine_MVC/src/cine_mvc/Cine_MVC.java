package cine_mvc;

import Controlador.Controlador;
import Modelo.Cine;
import Vista.Vista;

public class Cine_MVC {

    public static void main(String[] args) {
        Cine cine = new Cine(10);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(cine, vista);
        controlador.iniciar();
    }
    
}
