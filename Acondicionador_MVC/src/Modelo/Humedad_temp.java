package Modelo;

import java.util.Random;

public class Humedad_temp {
    public static Random azar = new Random();
    private boolean [] temp;
    private boolean [] humed;
    
    public Humedad_temp(int cantidad){
        temp = new boolean[cantidad];
        humed = new boolean[cantidad];
        condicion();
    }
    
    public void condicion(){
        for (int i = 0; i < temp.length; i++){
            temp[i] = azar.nextBoolean();
            humed[i] = azar.nextBoolean();
        }
    }
    
    public boolean getTemperatura(int dato){
        return temp[dato];
    }
    
    public boolean getHumedad(int dato){
        return humed[dato];
    }
    
    public int getCantidad(){
        return temp.length;
    }
}
