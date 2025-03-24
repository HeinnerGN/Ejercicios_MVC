package tienda_mvc;

import Modelo.Modelo;
import Controlador.Controlador;
import Vista.Vista;

public class Tienda_MVC {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(5, vista);
        controlador.iniciar();
        vista.cerrarScanner();
    }
    
}
