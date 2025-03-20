package fizzbuzz_mvc;

import java.util.Arrays;

public class Controlador {
    private Vista objvista;
    private Modelo objmodelo;
    
    public Controlador(){
        
    }
    
    public void empezar(String resultado[]){
        this.objvista = new Vista();
        this.objmodelo = new Modelo(resultado);
        objvista.imprimirdato();
        objvista.mostrardato(resultado);
    }
}
