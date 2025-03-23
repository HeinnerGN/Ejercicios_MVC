package Controlador;

import Modelo.Humedad_temp;
import Vista.Vista;
import java.util.Random;

public class Controlador {
    private Humedad_temp modelo;
    private Vista vista;
    private Random azar;
    
    public Controlador(Humedad_temp modelo, Vista vista){
        this.modelo = modelo;
        this.vista = vista;
        this.azar = new Random();
    }
    
    public void iniciarproceso(){
        boolean continuar = true;
        int Cantidad = modelo.getCantidad();
        
        while(continuar){
            for (int i = 0; i < Cantidad; i++){
                boolean tempmayor28 = modelo.getTemperatura(i);
                boolean humedmayor60 = modelo.getHumedad(i);
                boolean tempmayor30 = azar.nextBoolean();
                
                if ((tempmayor28 && humedmayor60) || tempmayor30){
                    vista.estadoAire(true);
                }
                else {
                    vista.estadoAire(false);
                }
                continuar = vista.repetirproceso();
            }
        }
    }
}
