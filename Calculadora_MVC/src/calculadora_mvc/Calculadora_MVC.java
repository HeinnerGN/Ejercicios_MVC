package calculadora_mvc;

import Modelo.Calculadora;
import Vista.Vista;
import Controlador.Controlador;

public class Calculadora_MVC {

    public static void main(String[] args) {
        Calculadora modelo = new Calculadora();
        Vista vista = new Vista();
        Controlador controlar = new Controlador(modelo, vista);
        controlar.comenzarOpe();
    }
    
}
