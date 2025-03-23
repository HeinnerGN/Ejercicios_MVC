package Modelo;

import java.util.Random;

public class Modelo {
    private boolean [] sensores;
    private Alarma alarma;
    
    
    public Modelo(int canti){
        sensores = new boolean[canti];
        alarma = new Alarma();
    }
    
    public boolean[] getSensores(){
        return sensores;
    }
    
    public void actualiSensores(){
        Random random = new Random();
        for (int i = 0; i<sensores.length; i++){
            sensores[i] = random.nextBoolean();
        }
    }
    
    public void alarmaActiva(boolean denoche){
        int sensoresdetec = 0;
        
        for (boolean sensor : sensores){
            if(sensor) sensoresdetec++;
        }
        
        if(sensoresdetec >= 2 && denoche){
            alarma.activar();
        }
        else {
            alarma.desactivar();
        }
    }
    
    public Alarma getAlarma(){
            return alarma;
        }
}
