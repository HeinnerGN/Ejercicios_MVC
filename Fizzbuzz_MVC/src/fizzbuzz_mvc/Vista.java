package fizzbuzz_mvc;

import java.util.Arrays;

public class Vista {
    
    public Vista(){
        
    }
    
    public void imprimirdato(){
        System.out.println("Iniciando.");
    }
    
    public void mostrardato(String resultado[]){
        System.out.println("Resultado:\n"+Arrays.toString(resultado));
    }
}
