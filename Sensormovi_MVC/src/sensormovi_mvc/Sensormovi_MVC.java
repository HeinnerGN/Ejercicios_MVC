package sensormovi_mvc;

import Modelo.Modelo;
import Vista.Vista;
import Controlador.Controlador;

public class Sensormovi_MVC {

    public static void main(String[] args) {
        Modelo modelo = new Modelo(3);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarProceso();
    }
}
