package control_lucesmvc;

import Controlador.Controlador;
import Modelo.Luces;
import Vista.Casa;

public class Control_lucesMVC {

    public static void main(String[] args) {
        Luces modelo = new Luces();
        Casa vista = new Casa();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.Empezar();
    }
    
}
